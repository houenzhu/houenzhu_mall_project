package com.zhe.springcloud.shopping.entity;

import java.io.Serializable;

/**
 * @version 1.0
 * @Author 朱厚恩
 * 自定义泛型
 * 后端与前端的数据通信格式
 */

public class Result<T> implements Serializable {
    private String code; // 状态码
    private String msg; // 说明
    private T data; // 返回的数据

    public Result() {

    }

    public Result(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static Result success(String msg) {
        Result result = new Result();
        result.setCode("200");
        result.setMsg(msg);
        return result;
    }

    // 返回成功并且携带数据
    // 如果要在static方法使用泛型, 需要再static后写泛型标志
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>(data);
        result.setCode("200");
        result.setMsg("success");
        return result;
    }

    public static <T> Result<T> success(String msg, T data) {
        Result<T> result = new Result<>(data);
        result.setMsg(msg);
        result.setCode("200");
        return result;
    }

    public static Result error(String code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    // 返回成功并且携带数据
    // 如果要在static方法使用泛型, 需要再static后写泛型标志
    public static <T> Result<T> error(String code, String msg, T data) {
        Result<T> result = new Result<>(data);
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
