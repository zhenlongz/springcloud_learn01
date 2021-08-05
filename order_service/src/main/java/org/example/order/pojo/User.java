package org.example.order.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author long
 */
@Data
@Builder
@ToString
public class User {

    private String userID;
    private String password;
}
