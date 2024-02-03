package com.zhe.springcloud.shopping.entity.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author 朱厚恩
 * 大类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LargeCategory implements Serializable {
    // 大类id
    private Integer largeCategoryId;
    // 大类名称
    private String categoryName;
    // 大类描述
    private String describe;
}
