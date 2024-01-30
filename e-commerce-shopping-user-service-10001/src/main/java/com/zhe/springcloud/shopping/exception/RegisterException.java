package com.zhe.springcloud.shopping.exception;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

public class RegisterException extends RuntimeException{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
