package com.atguigu.kipchogemall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.kipchogemall.warehouse.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 12:36:54
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

