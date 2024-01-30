package com.zhe.springcloud.shopping.filter;

import com.zhe.springcloud.shopping.utils.TokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;

/**
 * @version 1.0
 * @Author 朱厚恩
 */

@Component
@Slf4j
public class GateWayGlobalFilter implements GlobalFilter, Ordered {

    private static final String USER_LOGIN_URL = "/api/user/login";
    private static final String USER_REGISTER_URL = "/api/user/register";
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        ServerHttpRequest request = exchange.getRequest();
//        URI uri = request.getURI();
//        // 如果请求的是登录或者注册,直接放行
//        if (USER_LOGIN_URL.equals(uri.getPath()) || USER_REGISTER_URL.equals(uri.getPath())) {
//            return chain.filter(exchange);
//        }
//        String token = request.getHeaders().getFirst("Authorization");
//        log.info("该用户的token = {}", token);
//        // 如果token为空
//        if (token == null) {
//            return returnFalse(exchange);
//        }
//        // 没有token字符串
//        if (StringUtils.isBlank(token)) {
//            return returnFalse(exchange);
//        }
//        String userId = token.split("_")[1];
//        String savedToken = TokenUtils.getToken(Integer.parseInt(userId));
//        if (!(token.equals(savedToken))) {
//            // token 不相符
//            return returnFalse(exchange);
//        }
//        TokenUtils.setUserThreadLocal(Integer.parseInt(userId));
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }

    public Mono<Void> returnFalse(ServerWebExchange exchange) {
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        return exchange.getResponse().setComplete();
    }
}
