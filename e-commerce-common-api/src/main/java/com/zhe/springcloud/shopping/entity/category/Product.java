package com.zhe.springcloud.shopping.entity.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private Integer productId;
    private String productName;
    private Integer smallCategoryId;
    private BigDecimal price;
    private String imageUrl;
    private SmallCategory smallCategory;
}
