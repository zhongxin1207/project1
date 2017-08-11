package com.lanou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor2 implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		//请求完成时执行
		System.out.println("我已经进来了222222222222----------------afterCompletion");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		//请求之后执行的方法
		System.out.println("我要进来了222222222222222--------------postHandle");
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		
		//在请求发来的时候还未开始处理 就已经执行这个方法
		//true：请求通过
		//false：不同过
		
		
		
		System.out.println("我要进来了22222222222-----------------preHandle");
		
		return true;
	}

}
