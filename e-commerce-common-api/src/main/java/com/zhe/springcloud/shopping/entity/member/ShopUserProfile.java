package com.zhe.springcloud.shopping.entity.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author 朱厚恩
 * <p>用户详细信息类</p>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopUserProfile implements Serializable {
    // 用户描述id
    private Integer profileId;
    // 用户id
    private Integer userId;
    // 名字
    private String firstName;
    // 姓
    private String lastName;
    // 地址
    private String address;
}
