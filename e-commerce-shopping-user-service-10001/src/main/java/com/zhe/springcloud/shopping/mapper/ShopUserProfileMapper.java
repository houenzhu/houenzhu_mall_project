package com.zhe.springcloud.shopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhe.springcloud.shopping.entity.ShopUserProfile;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

public interface ShopUserProfileMapper extends BaseMapper<ShopUserProfile> {
    void addUserProfile(@Param("userId") Integer userId);
}
