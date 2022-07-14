package com.atguigu.kipchogemall.product.dao;

import com.atguigu.kipchogemall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-07-13 23:01:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
