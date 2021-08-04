package org.example.feign.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("order-service")
public interface OrderFeign {
    @GetMapping("/order/findOrderInfoByUserId/{userId}")
    String findOrderInfoByUserId(@PathVariable("userId") String userId);
}
