package com.zhe.springcloud.shopping;

import com.zhe.springcloud.shopping.entity.ShopUser;
import com.zhe.springcloud.shopping.mapper.ShopUserMapper;
import com.zhe.springcloud.shopping.service.ShopUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

@SpringBootTest
public class ShopUserTest {

    @Resource
    private ShopUserService shopUserService;
    @Resource
    private ShopUserMapper shopUserMapper;

    @Test
    public void login() {
        ShopUser shopUser = new ShopUser();
        shopUser.setEmail("759959801@qq.com");
        shopUser.setPassword("123456");
        ShopUser user = shopUserMapper.login(shopUser);
        System.out.println("user = " + user);
    }

    @Test
    public void register() {
        ShopUser shopUser = new ShopUser();
        shopUser.setUsername("yanzhi");
        shopUser.setPassword("123456");
        shopUser.setPhone("1884212484");
        shopUser.setEmail("23664941154@sina.com");
        shopUserService.register(shopUser);
        System.out.println("shopUser的id = " + shopUser.getUserId());
    }
}
