package com.springannotation.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class UserBean2 {
    private String username;
    private int age;
    private double income;
    private String[] interests;
    private boolean married;
    //List���ܵ���ʹ�ã�����Ҫ�󶨵�ĳһ�������Bean,����Ҫʵ����ArrayList
    private List<AddressListBean> list=new ArrayList<AddressListBean>();
    //Set���ܵ���ʹ�ã�����Ҫ�󶨵�ĳһ�������Bean,����Ҫʵ����HashSet
    private Set<AddressSetBean> set=new HashSet<AddressSetBean>();
    //Map���ܵ���ʹ�ã�����Ҫ�󶨵�ĳһ�������Bean,����Ҫʵ����HashMap
    private Map<String,AddressMapBean> map=new HashMap<String,AddressMapBean>();
    //������������
    private AddressBean address;
    
    public UserBean2(){
        //set������Ҫ��ǰ�������
        for(int i=0;i<2;i++){
            AddressSetBean asb=new AddressSetBean();
            set.add(asb);
        }
        
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
    public String[] getInterests() {
        return interests;
    }
    public void setInterests(String[] interests) {
        this.interests = interests;
    }
    public boolean isMarried() {
        return married;
    }
    public void setMarried(boolean married) {
        this.married = married;
    }
    
        public Map<String, AddressMapBean> getMap() {
        return map;
    }
    public void setMap(Map<String, AddressMapBean> map) {
        this.map = map;
    }
    
    public Set<AddressSetBean> getSet() {
        return set;
    }
    public void setSet(Set<AddressSetBean> set) {
        this.set = set;
    }
    public List<AddressListBean> getList() {
        return list;
    }
    public void setList(List<AddressListBean> list) {
        this.list = list;
    }
    public AddressBean getAddress() {
        return address;
    }
    public void setAddress(AddressBean address) {
        this.address = address;
    }

}
