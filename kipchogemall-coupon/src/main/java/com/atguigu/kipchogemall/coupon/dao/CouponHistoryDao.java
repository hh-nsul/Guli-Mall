package com.atguigu.kipchogemall.coupon.dao;

import com.atguigu.kipchogemall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author ${author}
 * @email ${email}
 * @date 2022-07-14 11:57:45
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
