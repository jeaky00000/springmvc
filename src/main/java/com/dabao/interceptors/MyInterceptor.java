package com.dabao.interceptors;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

    public boolean preHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("pre handler");
        return true;
    }

    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("post handler");
    }

    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("after completion");
    }
}
