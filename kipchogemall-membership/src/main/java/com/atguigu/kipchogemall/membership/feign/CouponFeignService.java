package com.atguigu.kipchogemall.membership.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("kipchogemall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/membership/list")
    public R membershipCoupons();
}
