package com.lanou.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor2 implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		//�������ʱִ��
		System.out.println("���Ѿ�������222222222222----------------afterCompletion");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		//����֮��ִ�еķ���
		System.out.println("��Ҫ������222222222222222--------------postHandle");
		
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		
		//����������ʱ��δ��ʼ���� ���Ѿ�ִ���������
		//true������ͨ��
		//false����ͬ��
		
		
		
		System.out.println("��Ҫ������22222222222-----------------preHandle");
		
		return true;
	}

}
