package com.evaluation.dto;

import lombok.Data;

/**
 * @author Wushiai
 * @date 2019/10/13 8:10
 */
@Data
public class LoginDTO {

    //用户姓名
    private String username;

    //用户密码
    private String password;

    //用户类型
    private String userType;
}
