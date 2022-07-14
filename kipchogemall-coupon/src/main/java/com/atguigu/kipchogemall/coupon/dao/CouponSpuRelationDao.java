package com.atguigu.kipchogemall.coupon.dao;

import com.atguigu.kipchogemall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 11:57:44
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
