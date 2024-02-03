package com.zhe.springcloud.shopping.entity.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @version 1.0
 * @Author 朱厚恩
 * <p>用户账户类</p>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopUserAccount implements Serializable {
    // 账户id
    private Integer accountId;
    // 用户id
    private Integer userId;
    // 余额
    private BigDecimal balance;
}
