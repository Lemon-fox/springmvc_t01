package com.springannotation.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springannotation.entity.UserBean;



@Controller  // @Controller��֪Spring��������һ�����������
public class LoginController {
    
    private Logger log=Logger.getLogger(this.getClass());
    
    
    
    /* @RequestMapping("/login.do")  // @RequestMapping��֪�÷��������/login.do����Ĵ�����
     public String login(String username){
         System.out.println(username);
        return "index";           // ���ص��ַ���������ViewName
         
     }*/
    
    /**
     * 
     * 1 �����������
     * HttpServletRequest,HttpServletResponse,HttpSession
     * ����˳��������ж���
     * @param request
     * @return
     */

    /*@RequestMapping("/login.do") 
    public ModelAndView login(HttpServletRequest request){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        log.info(username);
        log.info(password);
        ModelAndView  mav=new ModelAndView();
        mav.setViewName("index");
        return mav;
        
    }*/
    
    /**
     * 2���������ύ����
     */
    
    /*@RequestMapping("/login.do")
    public String login(@RequestParam("username")String name,@RequestParam("password")String pwd){
        log.info(name);
        log.info(pwd);
        return "index";
    }*/

    
    
    
    
    /**method��Ҫ���ƶ����󷽷��Ĺ��򣬱��磺���������RequestMethod.POST��
     * ��ô��ı��ύ�ͱ���ʹ��POST�ύ�����򽫱�405���� 
     params="password" ��ʾ�ҵı��ύ�У�һ��Ҫ��password������������򽫱�400�Ĵ���*/
    
    /**
     * 2���������ύ����
     */
    /*@RequestMapping(value="/login.do",method=RequestMethod.POST,params="password")
    //������������ύ��������ͬ�����Բ�����@RequestParam
    public ModelAndView login(String username,String password){
        log.info(username);
        log.info(password);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }*/
    
    
    /**
     * 3 �����ݷ�װ��Bean����
     * @param user
     * @return
     */
    @RequestMapping(value="/login.do")
    public String login(UserBean user){
        log.info(user.getUsername());
        log.info(user.getPassword());
        return "index";
    }
    
     
     
}
