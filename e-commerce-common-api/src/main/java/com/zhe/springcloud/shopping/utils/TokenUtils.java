package com.zhe.springcloud.shopping.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

public class TokenUtils {
    private static final Map<Integer, String> MAP = new HashMap<>();
    private static final ThreadLocal<Integer> USER_THREAD_LOCAL = new ThreadLocal<>();
    public static void setToken(Integer key, String token) {
        MAP.put(key, token);
    }

    public static String getToken(Integer key) {
        return MAP.get(key);
    }

    public static void setUserThreadLocal(Integer userId) {
        USER_THREAD_LOCAL.set(userId);
    }
}
