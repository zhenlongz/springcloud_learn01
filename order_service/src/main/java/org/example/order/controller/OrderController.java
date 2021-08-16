package org.example.order.controller;

import com.alibaba.fastjson.JSON;
import io.micrometer.core.instrument.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.example.feign.pojo.BaseUser;
import org.example.order.pojo.LoginResp;
import org.example.order.pojo.User;
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
     * 根据用户id查询订单列表
     */
    @PostMapping("/findOrderInfoByUserId/{scene}")
    public LoginResp findOrderInfoByUserId(@PathVariable("scene") String scene, @RequestBody User user) {
        throw new RuntimeException();
    }


}
