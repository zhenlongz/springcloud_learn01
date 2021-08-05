package org.example.user.controller;

import org.example.feign.order.OrderFeign;
import org.example.feign.pojo.BaseUser;
import org.example.feign.pojo.BaseUserResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


/**
 * @author long
 */
@RestController
@RequestMapping("/user")
@RefreshScope //开启配置中心动态刷新
public class UserController {

    @Autowired
    private OrderFeign orderFeign;

    /**
     * 用户登录
     *
     * @param userName
     * @param password
     * @return
     */
    @GetMapping("/login/{userName}/{password}")
    public String login(@PathVariable("userName") String userName, @PathVariable("password") String password) {
        BaseUserResp loginResp = orderFeign.findOn8yUserId("login", BaseUser.builder().userId(userName).password(password).build());

        String scene = loginResp.getScene();
        HashMap<String, String> userResp = loginResp.getUserResp();
        return scene;

    }


}
