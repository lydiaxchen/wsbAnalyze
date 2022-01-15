package com.xuan.controller;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        request.getSession().getAttribute("loginUser");
        Object loginUser = request.getSession().getAttribute("loginUser");
        if(loginUser == null){ // not login yet
            request.setAttribute("msg", "do not have authority");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        }
        else{
            return true;}
    }

} // end class
