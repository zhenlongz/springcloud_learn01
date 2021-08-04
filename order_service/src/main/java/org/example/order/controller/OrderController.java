package org.example.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author long
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {


    @Value("${server.port}")
    private Integer port;

    /**
     *     根据用户id查询订单列表
     */
    @GetMapping("/findOrderInfoByUserId/{userId}")
    public String findOrderInfoByUserId(@PathVariable("userId") String userId) {
        log.info("order is call...");
        return userId;
    }


}
