package com.huaying.hqwmall.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huaying.common.exception.MyException;
import com.huaying.common.page.PageData;
import com.huaying.common.utils.StringUtil;
import net.sf.jsqlparser.statement.execute.Execute;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huaying.common.utils.PageUtils;
import com.huaying.common.utils.Query;

import com.huaying.hqwmall.order.dao.OrderDao;
import com.huaying.hqwmall.order.entity.OrderEntity;
import com.huaying.hqwmall.order.service.OrderService;
import org.springframework.transaction.annotation.Transactional;


@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderEntity> page = this.page(
                new Query<OrderEntity>().getPage(params),
                new QueryWrapper<OrderEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int save(PageData pd) throws Exception {
        if (StringUtil.isEmpty(pd.getString("orderSn"))) {
            throw new MyException("订单号不能为空");
        }
        OrderEntity orderEntity = JSONObject.toJavaObject(JSONObject.parseObject(pd.toJsonString()), OrderEntity.class);
        return baseMapper.insert(orderEntity);
    }

    @Override
    public IPage<PageData> orderListPage(PageData pd) {
        int pageSize = 10;
        int currPage = 1;
        if (pd.getInteger("pageSize") > 0) {
            pageSize = pd.getInteger("pageSize");
            currPage = pd.getInteger("currPage");
        }
        Page<PageData> page = new Page<PageData>(currPage, pageSize);
        String orderSn = pd.getString("orderSn");
        IPage<PageData> lists = orderDao.orderListPage(page, orderSn);
        return lists;
    }

}