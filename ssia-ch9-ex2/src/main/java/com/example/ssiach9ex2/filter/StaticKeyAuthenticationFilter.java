package com.example.ssiach9ex2.filter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class StaticKeyAuthenticationFilter implements Filter {

    @Value("${authorization.key}")
    private String authorizationKey;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        var httpRequest = (HttpServletRequest) request;
        var httpResponse = (HttpServletResponse) response;

        String authentication = httpRequest.getHeader("authorization");

        if (authorizationKey.equals(authentication)) {
            chain.doFilter(request, response);
        } else {
            // authentication == null 이면?
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }

    }

}
