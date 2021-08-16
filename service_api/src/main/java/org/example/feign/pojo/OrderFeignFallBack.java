package org.example.feign.pojo;

import lombok.extern.slf4j.Slf4j;
import org.example.feign.order.OrderFeign;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class OrderFeignFallBack implements OrderFeign {

    @Override
    public BaseUserResp findOn8yUserId(String scene, BaseUser user) {
        log.debug("fallback run....");
        BaseUserResp baseUserResp = new BaseUserResp();
        baseUserResp.setScene("123");
        return baseUserResp;
    }
}
