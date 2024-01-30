package com.zhe.springcloud.shopping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhe.springcloud.shopping.entity.ShopUser;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

public interface ShopUserService extends IService<ShopUser> {
    // 登录
    ShopUser login(ShopUser shopUser);
    void register(ShopUser shopUser);
}
