package com.icc.czx.one.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by czx on 2018/3/21.
 */
@Data
public class UserInfoModel implements Serializable{
    private Integer userid;
    private String username;//帐号
    private String nikename;//名称（昵称或者真实姓名，不同系统不同定义）
    private String phone; //手机;
    private String password; //密码;
    private String salt;//加密密码的盐
    private Integer state;//用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.

}
