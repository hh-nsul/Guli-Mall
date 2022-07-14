package com.atguigu.kipchogemall.warehouse.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.kipchogemall.warehouse.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 12:36:54
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

