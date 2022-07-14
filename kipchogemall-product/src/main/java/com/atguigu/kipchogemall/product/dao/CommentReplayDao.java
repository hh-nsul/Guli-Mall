package com.atguigu.kipchogemall.product.dao;

import com.atguigu.kipchogemall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-07-13 23:01:01
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
