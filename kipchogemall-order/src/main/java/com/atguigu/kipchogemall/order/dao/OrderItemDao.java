package com.atguigu.kipchogemall.order.dao;

import com.atguigu.kipchogemall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 12:29:14
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
