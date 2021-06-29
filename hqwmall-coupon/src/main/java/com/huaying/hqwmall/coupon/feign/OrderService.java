package com.huaying.hqwmall.coupon.feign;

import com.huaying.common.page.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order-service",path = "/order")
@Component
public interface OrderService {

    @GetMapping("/test")
    public String test();

}
