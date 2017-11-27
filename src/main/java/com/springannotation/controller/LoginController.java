package com.springannotation.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springannotation.entity.UserBean;



@Controller  // @Controller告知Spring容器这是一个控制器组件
public class LoginController {
    
    private Logger log=Logger.getLogger(this.getClass());
    
    
    
    /* @RequestMapping("/login.do")  // @RequestMapping告知该方法是针对/login.do请求的处理方法
     public String login(String username){
         System.out.println(username);
        return "index";           // 返回的字符串被当做ViewName
         
     }*/
    
    /**
     * 
     * 1 、作用域对象
     * HttpServletRequest,HttpServletResponse,HttpSession
     * 个数顺序可以自行定义
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
     * 2、单个表单提交数据
     */
    
    /*@RequestMapping("/login.do")
    public String login(@RequestParam("username")String name,@RequestParam("password")String pwd){
        log.info(name);
        log.info(pwd);
        return "index";
    }*/

    
    
    
    
    /**method主要是制定请求方法的规则，比如：如果设置了RequestMethod.POST，
     * 那么你的表单提交就必须使用POST提交，否则将报405错误 
     params="password" 表示我的表单提交中，一定要有password这个参数，否则将报400的错误*/
    
    /**
     * 2、单个表单提交数据
     */
    /*@RequestMapping(value="/login.do",method=RequestMethod.POST,params="password")
    //如果属性名与提交项名称相同，可以不配置@RequestParam
    public ModelAndView login(String username,String password){
        log.info(username);
        log.info(password);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }*/
    
    
    /**
     * 3 表单数据封装的Bean对象
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
