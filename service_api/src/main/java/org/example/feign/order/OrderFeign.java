package org.example.feign.order;

import org.example.feign.pojo.BaseUser;
import org.example.feign.pojo.BaseUserResp;
import org.example.feign.pojo.OrderFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;


@FeignClient(value = "order-service", fallback = OrderFeignFallBack.class)
public interface OrderFeign {
    /**
     * feign传入userId
     */
    @PostMapping("/order/findOrderInfoByUserId/{scene}")
    BaseUserResp findOn8yUserId(@PathVariable("scene") String scene, @RequestBody BaseUser user);

}
