package com.zhe.springcloud.shopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhe.springcloud.shopping.entity.ShopUserAccount;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

public interface ShopUserAccountMapper extends BaseMapper<ShopUserAccount> {
    void addAccount(@Param("userId") Integer userId);
}
