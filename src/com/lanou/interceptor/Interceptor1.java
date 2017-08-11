package com.lanou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor1 extends HandlerInterceptorAdapter{
	//适配器模式：为了防止接口冲突
	//适配器类主动实现了相关接口的方法
	//在使用中，集成适配器类创建子类使用
	//子类可以自己决定重写那些方法，而不是全部实现所有接口方法
	
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//请求完成时执行
		System.out.println("我已经进来了111111111------------------afterCompletion");
		


	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		//请求之后执行的方法
		System.out.println("我要进来了111111111111------------postHandle");
		
		
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//在请求发来的时候还未开始处理 就已经执行这个方法
		//true：请求通过
		//false：不同过
		
		
		
		System.out.println("我要进来了111111111111------------preHandle");
		return true;
	}

	

	
	
	
	

}
