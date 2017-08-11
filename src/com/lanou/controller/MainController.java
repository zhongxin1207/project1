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
    
    //��½ҳ��
    @RequestMapping(value="/loginpage")
	public String loginpage(){
    	
    	
    	
    	return "loginpage";
    }
    
	//form������
    @RequestMapping(value="/login")
	public String login(HttpServletRequest reqest, @RequestParam("username") String name,@RequestParam("password") String password){
    	
    	HttpSession session=reqest.getSession();
    	session.setAttribute("username", name);
    	//��½�ɹ����ض���userinfo
    	return "redirect:userinfo";
    }
    
    
  //��½ҳ��
    @RequestMapping(value="/userinfo")
	public String userinfo(){
    	
    	
    	
    	return "userinfo";
    }
    
    
    //��½ҳ��
    @RequestMapping(value="loginout")
	public String loginout(HttpServletRequest reqest){
    	
    	HttpSession session=reqest.getSession();
    	
    	session.invalidate();
    	return "loginpage";
    } 
    
    
    
}
