package org.example.feign.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author long
 */
@Data
@Builder
@ToString
public class BaseUser {
    private String userId;
    private String password;
}
