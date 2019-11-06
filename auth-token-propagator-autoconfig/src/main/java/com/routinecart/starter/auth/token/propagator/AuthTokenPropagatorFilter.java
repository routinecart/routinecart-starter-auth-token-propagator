package com.routinecart.starter.auth.token.propagator;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import static com.routinecart.starter.auth.token.propagator.AuthTokenContextHolder.resetAuthTokenContextHolder;
import static com.routinecart.starter.auth.token.propagator.AuthTokenContextHolder.setAuthTokenContextHolder;
import static com.routinecart.starter.auth.token.propagator.AuthTokenHeader.AUTH_TOKEN_HEADER;

public class AuthTokenPropagatorFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String requestAuthToken = httpServletRequest.getHeader(AUTH_TOKEN_HEADER);
        try {
            setAuthTokenContextHolder(requestAuthToken);
            chain.doFilter(request, response);
        } finally {
            resetAuthTokenContextHolder();
        }
    }

    @Override
    public void destroy() {

    }
}
