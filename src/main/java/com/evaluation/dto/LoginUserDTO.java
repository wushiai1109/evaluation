package com.evaluation.dto;

import lombok.Data;

/**
 * @author Wushiai
 * @date 2019/10/13 8:10
 */
@Data
public class LoginUserDTO {

    private Integer id;

    //用户名
    private String username;

    //用户密码
    private String password;
}
