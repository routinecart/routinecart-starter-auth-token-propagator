package com.routinecart.starter.auth.token.propagator;

import org.springframework.core.NamedThreadLocal;

public class AuthTokenContextHolder {

    private static final ThreadLocal<String> authTokenContextHolder = new NamedThreadLocal<>("Auth Token Header");

    private AuthTokenContextHolder() {
    }

    static void setAuthTokenContextHolder(String requestAuthTokenHeader) {
        authTokenContextHolder.set(requestAuthTokenHeader);
    }

    static String getAuthTokenContextHolder() {
        return authTokenContextHolder.get();
    }

    static void resetAuthTokenContextHolder() {
        authTokenContextHolder.remove();
    }
}
