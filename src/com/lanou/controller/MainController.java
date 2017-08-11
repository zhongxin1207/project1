package com.lanou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
    @RequestMapping(value="/")
	public String ss(){
    	
    	
    	
    	return "index";
    }
    
    //登陆页面
    @RequestMapping(value="/loginpage")
	public String loginpage(){
    	
    	
    	
    	return "loginpage";
    }
    
	//form表单请求
    @RequestMapping(value="/login")
	public String login(HttpServletRequest reqest, @RequestParam("username") String name,@RequestParam("password") String password){
    	
    	HttpSession session=reqest.getSession();
    	session.setAttribute("username", name);
    	//登陆成功，重定向到userinfo
    	return "redirect:userinfo";
    }
    
    
  //登陆页面
    @RequestMapping(value="/userinfo")
	public String userinfo(){
    	
    	
    	
    	return "userinfo";
    }
    
    
    //登陆页面
    @RequestMapping(value="loginout")
	public String loginout(HttpServletRequest reqest){
    	
    	HttpSession session=reqest.getSession();
    	
    	session.invalidate();
    	return "loginpage";
    } 
    
    
    
}
