package com.zhe.springcloud.shopping.handle;

import com.alibaba.fastjson.JSON;
import com.zhe.springcloud.shopping.entity.Result;
import com.zhe.springcloud.shopping.exception.LoginException;
import com.zhe.springcloud.shopping.exception.RegisterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

@ControllerAdvice
public class UserExceptionHandle {

    // 处理登录异常
    @ExceptionHandler({LoginException.class})
    public void LoginExceptionHandle(HttpServletResponse response, Exception e) {
        throwException(response, e, "403");
    }

    @ExceptionHandler(RegisterException.class)
    public void registerException(HttpServletResponse response, Exception e) {
        throwException(response, e, "500");
    }

    private void throwException(HttpServletResponse response, Exception e, String code) {
        response.setContentType("application/json;charset=UTF-8");
        Result result = Result.error(code, e.getMessage());
        String json = JSON.toJSONString(result);
        try {
            response.getWriter().write(json);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
