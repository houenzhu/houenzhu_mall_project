package com.zhe.springcloud.shopping.entity.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author 朱厚恩
 * <p>用户信息类</p>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopUser implements Serializable {
    // 用户id
    private Integer userId;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 电子邮件
    private String email;
    // 电话号码
    private String phone;
    // 头像
    private String avater;
}
