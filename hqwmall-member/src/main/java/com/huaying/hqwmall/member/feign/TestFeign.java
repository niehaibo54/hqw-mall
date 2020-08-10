package com.huaying.hqwmall.member.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("hqwmall-coupon")
public interface TestFeign {

    @RequestMapping("coupon/coupon/testFeign")
    public String testFeign();
}
