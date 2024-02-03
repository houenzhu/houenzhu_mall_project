package com.zhe.springcloud.shopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhe.springcloud.shopping.entity.member.ShopUser;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

public interface ShopUserMapper extends BaseMapper<ShopUser> {
    // 登录
    ShopUser login(ShopUser shopUser);
    void register(ShopUser shopUser);
    void updatePersonInfo(ShopUser shopUser);
}
