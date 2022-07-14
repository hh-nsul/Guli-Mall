package com.atguigu.kipchogemall.membership.dao;

import com.atguigu.kipchogemall.membership.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 12:12:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
