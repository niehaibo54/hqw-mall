package com.huaying.hqwmall.order.dao;

import com.huaying.hqwmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author niehaibo
 * @email 838600724@qq.com
 * @date 2020-08-10 11:58:59
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
