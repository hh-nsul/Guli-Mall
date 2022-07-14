package com.atguigu.kipchogemall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.kipchogemall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-07-13 23:01:02
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

