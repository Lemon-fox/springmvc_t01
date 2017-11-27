package com.lovo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller{
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception{
		//�õ�ҳ���ֵ
		String username = request.getParameter("username");
		//ѡ����һ��ҳ��
		ModelAndView mav = new ModelAndView();
		//���ģ�����ݣ�����ʹ�����POJO����
		mav.addObject("username" ,username);
        //�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
        mav.setViewName("index");
		
		return mav;
	}

}
