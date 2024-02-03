package com.zhe.springcloud.shopping.controller;

import com.zhe.springcloud.shopping.entity.Result;
import com.zhe.springcloud.shopping.entity.member.ShopUser;
import com.zhe.springcloud.shopping.service.ShopUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

@RestController
@RequestMapping("/member")
public class ShopUserController {

    @Resource
    private ShopUserService shopUserService;

    /**
     * 登录接口
     * @param shopUser
     * @return
     */
    @GetMapping("/login")
    public Result<Map<String, Object>> login(@RequestBody ShopUser shopUser) {
        ShopUser user = shopUserService.login(shopUser);
        Map<String, Object> map = new HashMap<>();
        map.put("user", user);
        return Result.success("登录成功!", map);
    }

    /**
     * 注册用户
     * @param shopUser
     * @return
     */
    @PostMapping("/register")
    public Result register(@RequestBody ShopUser shopUser) {
        shopUserService.register(shopUser);
        return Result.success("注册成功!快去选心仪的商品吧!");
    }

    @PutMapping("/updateInfo")
    public Result updateInfo(@RequestBody ShopUser shopUser) {
        shopUserService.updatePersonInfo(shopUser);
        return Result.success("更新成功!");
    }
}
