package com.zhe.springcloud.shopping.entity.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author 朱厚恩
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmallCategory implements Serializable {
    private Integer smallCategoryId;
    private Integer middleCategoryId;
    private Integer largeCategoryID;
    private String categoryName;
    private String describe;
    private LargeCategory largeCategory;
    private MiddleCategory middleCategory;
}
