package com.zhe.springcloud.shopping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhe.springcloud.shopping.entity.member.ShopUser;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

public interface ShopUserService extends IService<ShopUser> {
    // 登录
    ShopUser login(ShopUser shopUser);
    // 注册
    void register(ShopUser shopUser);
    // 更新个人信息
    void updatePersonInfo(ShopUser shopUser);
}
