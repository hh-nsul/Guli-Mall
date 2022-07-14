package com.atguigu.kipchogemall.membership.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.kipchogemall.membership.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 12:12:22
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

