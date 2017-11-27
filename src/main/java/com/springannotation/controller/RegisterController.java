package com.springannotation.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springannotation.entity.AddressListBean;
import com.springannotation.entity.AddressSetBean;
import com.springannotation.entity.UserBean2;

@Controller
public class RegisterController {
    private Logger log = Logger.getLogger(this.getClass());
    
    
    /*    @RequestMapping("/regist.do")
    public String regist(String username,int age,double income,String[] interests,boolean married){
        log.info("username="+username);
        log.info("age="+age);
        log.info("income="+income);
        log.info("interests="+interests.length);
        log.info("married="+married);
        for (String string : interests) {
            log.info("兴趣有："+string);
        }
        return "index";
        
    }
*/    
    //简单对象类型
    @RequestMapping("/regist.do")
    public String registBean(UserBean2 user){
        log.info("username:"+user.getUsername());
        log.info("age:"+user.getAge());
        log.info("income:"+user.getIncome());
        log.info("interests.length:"+user.getInterests().length);
        log.info("married:"+user.isMarried());
        log.info("addressList.size():"+user.getList().size());
        log.info("addressSet.size():"+user.getSet().size());
        log.info("addressMap.size():"+user.getMap().size());
        log.info("address:"+user.getAddress().getAddressName());
        
       for (String string : user.getInterests()) {
            log.info("具体的兴趣有=========" + string);
        }
       
       for(AddressListBean add:user.getList()){
           log.info("具体的list地址有=========" + add.getAddressListName());
       }
       
       for(AddressSetBean asetb:user.getSet()){
           log.info("具体的set地址有=========" + asetb.getAddressSetName());
       }
       
       for(int i=0;i<2;i++){
           log.info("具体的map地址有=========" + user.getMap().get("a"+i).getAddressMapName());
       }
       
        return "index";
    }
    

}
