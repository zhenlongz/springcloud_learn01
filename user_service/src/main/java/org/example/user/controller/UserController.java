package org.example.user.controller;

import org.example.feign.order.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;


/**
 * @author long
 */
@RestController
@RequestMapping("/user")
@RefreshScope //开启配置中心动态刷新
public class UserController {

    @Autowired
    private OrderFeign orderFeign;
    //用户登录

    @GetMapping("/login/{userName}/{password}")
    public String login(@PathVariable("userName") String userName, @PathVariable("password") String password) {
        return orderFeign.findOrderInfoByUserId(userName);
    }


}
