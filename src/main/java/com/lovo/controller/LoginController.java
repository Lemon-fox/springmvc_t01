package com.lovo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//public class LoginController implements Controller{
//	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception{
//		//�õ�ҳ���ֵ
//		String username = request.getParameter("username");
//		//ѡ����һ��ҳ��
//		ModelAndView mav = new ModelAndView();
//		//���ģ�����ݣ�����ʹ�����POJO����
//		mav.addObject("username" ,username);
//        //�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��  
//        mav.setViewName("index");
//		return mav;
//	}
//}
@Controller
public class LoginController {
	@RequestMapping("/login.do")
	public String login(String username){
		System.out.println(username);
		return "index";
	}
}
