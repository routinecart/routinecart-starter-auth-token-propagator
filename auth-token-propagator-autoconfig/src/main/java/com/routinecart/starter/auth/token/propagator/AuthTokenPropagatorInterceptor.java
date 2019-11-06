package com.routinecart.starter.auth.token.propagator;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import static com.routinecart.starter.auth.token.propagator.AuthTokenContextHolder.getAuthTokenContextHolder;
import static com.routinecart.starter.auth.token.propagator.AuthTokenHeader.AUTH_TOKEN_HEADER;

public class AuthTokenPropagatorInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header(AUTH_TOKEN_HEADER, getAuthTokenContextHolder());
    }

}
