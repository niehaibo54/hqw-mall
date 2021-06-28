package com.huaying.hqwmall.order.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huaying.common.page.PageData;
import com.huaying.hqwmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单
 * 
 * @author niehaibo
 * @email 838600724@qq.com
 * @date 2020-08-10 11:58:59
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

  //  List<PageData> orderListPage(PageData pd);

    IPage<PageData>  orderListPage(Page page,@Param("orderSn")String orderSn);
}
