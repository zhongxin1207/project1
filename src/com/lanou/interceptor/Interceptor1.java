package com.lanou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor1 extends HandlerInterceptorAdapter{
	//������ģʽ��Ϊ�˷�ֹ�ӿڳ�ͻ
	//������������ʵ������ؽӿڵķ���
	//��ʹ���У������������ഴ������ʹ��
	//��������Լ�������д��Щ������������ȫ��ʵ�����нӿڷ���
	
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//�������ʱִ��
		System.out.println("���Ѿ�������111111111------------------afterCompletion");
		


	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		//����֮��ִ�еķ���
		System.out.println("��Ҫ������111111111111------------postHandle");
		
		
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//����������ʱ��δ��ʼ���� ���Ѿ�ִ���������
		//true������ͨ��
		//false����ͬ��
		
		
		
		System.out.println("��Ҫ������111111111111------------preHandle");
		return true;
	}

	

	
	
	
	

}
