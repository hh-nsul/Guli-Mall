package com.atguigu.kipchogemall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.kipchogemall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 12:29:14
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

