package org.example.feign.pojo;

import lombok.Data;

import java.util.HashMap;
@Data
public class BaseUserResp {
    private String scene;
    private HashMap<String, String> userResp;
}
