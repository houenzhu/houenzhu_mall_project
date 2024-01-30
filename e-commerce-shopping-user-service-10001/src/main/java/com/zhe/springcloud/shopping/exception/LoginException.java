package com.zhe.springcloud.shopping.exception;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

public class LoginException extends RuntimeException{
    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }
}
