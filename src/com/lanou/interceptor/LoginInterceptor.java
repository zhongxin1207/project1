package com.lanou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		
		String url=arg0.getRequestURI();
		
		if(url.indexOf("login")>0){
			
			return true;
			
			
		}
		
		//当请求发送过来 首先确认有没有username
		HttpSession session=arg0.getSession(); 
		Object username=session.getAttribute("username");
		if (username!=null&&username!="") {
			
			return true;
		}else{
			//如果没有，跳转到登陆界面
		arg0.getRequestDispatcher("/WEB-INF/pages/loginpage.jsp").forward(arg0, arg1);
		
			return false;
			
		}
		
		
		
	}

}
