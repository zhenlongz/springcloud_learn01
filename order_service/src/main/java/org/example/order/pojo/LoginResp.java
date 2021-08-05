package org.example.order.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class LoginResp {
    private String scene;
    private UserResp userResp;
    @Data
    @AllArgsConstructor
    public static class UserResp {

        private String userId;
        private String password;
    }
}
