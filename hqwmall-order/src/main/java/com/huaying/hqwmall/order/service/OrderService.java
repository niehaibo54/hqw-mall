package com.huaying.hqwmall.order.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huaying.common.page.PageData;
import com.huaying.common.utils.PageUtils;
import com.huaying.hqwmall.order.entity.OrderEntity;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.Map;

/**
 * 订单
 *
 * @author niehaibo
 * @email 838600724@qq.com
 * @date 2020-08-10 11:58:59
 */


public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

    int save(PageData pd)throws Exception;

    IPage<PageData> orderListPage(PageData pd);

    String test();
}

