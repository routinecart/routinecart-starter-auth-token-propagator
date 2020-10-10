package com.routinecart.starter.auth.token.propagator.autoconfig;

import com.routinecart.starter.auth.token.propagator.AuthTokenPropagatorInterceptor;
import com.routinecart.starter.auth.token.propagator.AuthTokenPropagatorFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.lang.Integer.MAX_VALUE;

@Configuration
public class AuthTokenPropagatorAutoConfiguration {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new AuthTokenPropagatorFilter());
        filterRegistrationBean.setOrder(MAX_VALUE);
        return filterRegistrationBean;
    }

    @Bean
    public AuthTokenPropagatorInterceptor authTokenPropagatorInterceptor() {
        return new AuthTokenPropagatorInterceptor();
    }
}
