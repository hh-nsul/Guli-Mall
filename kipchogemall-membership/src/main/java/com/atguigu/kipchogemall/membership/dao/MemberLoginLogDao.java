package com.atguigu.kipchogemall.membership.dao;

import com.atguigu.kipchogemall.membership.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 12:12:22
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
