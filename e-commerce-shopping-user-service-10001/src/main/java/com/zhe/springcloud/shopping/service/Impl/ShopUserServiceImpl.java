package com.zhe.springcloud.shopping.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhe.springcloud.shopping.entity.ShopUser;
import com.zhe.springcloud.shopping.exception.LoginException;
import com.zhe.springcloud.shopping.exception.RegisterException;
import com.zhe.springcloud.shopping.mapper.ShopUserAccountMapper;
import com.zhe.springcloud.shopping.mapper.ShopUserMapper;
import com.zhe.springcloud.shopping.mapper.ShopUserProfileMapper;
import com.zhe.springcloud.shopping.service.ShopUserService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

@Service
@Slf4j
public class ShopUserServiceImpl extends ServiceImpl<ShopUserMapper, ShopUser> implements ShopUserService {

    @Resource
    private ShopUserMapper shopUserMapper;
    @Resource
    private ShopUserAccountMapper shopUserAccountMapper;
    @Resource
    private ShopUserProfileMapper shopUserProfileMapper;

    // 登录逻辑
    @Override
    public ShopUser login(ShopUser shopUser) {
        if (StringUtils.isBlank(shopUser.getUsername()) || StringUtils.isBlank(shopUser.getPassword())) {
            log.error("该用户用户名或密码为空");
            throw new LoginException("用户名或密码不能为空!");
        }
        ShopUser user = shopUserMapper.login(shopUser);
        if (null == user) {
            log.error("登录失败, 请检查用户名或者密码是否有误!");
            throw new LoginException("用户名或密码有误!");
        }
        log.info("用户id = {},登录成功!", user.getUserId());
        return user;
    }

    // 注册用户
    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void register(ShopUser shopUser) {
        try {
            // 添加用户user表
            log.info("用户开始生成...");
            shopUserMapper.register(shopUser);
            log.info("用户id = {}, 已生成...", shopUser.getUserId());
            // 生成用户账户, 并且初始化数据
            shopUserAccountMapper.addAccount(shopUser.getUserId());
            // 生成用户个人详细信息表，并且初始化数据
            shopUserProfileMapper.addUserProfile(shopUser.getUserId());
            log.info("用户id = {}, 信息初始化完成...", shopUser.getUserId());
        } catch (Exception e) {
            throw new RegisterException("哎呀, 注册失败了, 请重试!");
        }
    }

}
