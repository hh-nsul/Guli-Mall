package com.atguigu.kipchogemall.coupon.dao;

import com.atguigu.kipchogemall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 11:57:45
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
