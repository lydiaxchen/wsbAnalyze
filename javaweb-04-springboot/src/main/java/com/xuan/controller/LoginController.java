package com.xuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
 public class LoginController{

     @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password, Model model, HttpSession session) {
         // service
         if( !StringUtils.isEmpty(username) && "123456".equals(password)){
             session.setAttribute("loginUser", username);
             return "redirect:/main.html";
         }else{
             // tell user login fails
             model.addAttribute("msg", "wrong username or password");
             return "index";
         }

     }

}
