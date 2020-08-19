//package com.yxz.studyforspring.bean;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.BeanFactoryAware;
//import org.springframework.beans.factory.BeanNameAware;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//
///**
// * Created by YUEXINGZHONG on 2020/8/19 16:21
// */
//@Service
//public class UserService implements InitializingBean, BeanNameAware, BeanFactoryAware {
//
//    private String userName;
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    @PostConstruct
//    public void postConstruct() {
//        System.out.println(">>>> postConstruct");
//    }
//
//    @PreDestroy
//    public void preDestroy() {
//        System.out.println(">>>> preDestroy");
//    }
//
//    public UserService() {
//        System.out.println("烧起来了");
//    }
//
//    public void init() {
//        System.out.println(">>>> init");
//    }
//
//    public void destory() {
//        System.out.println(">>>> destory");
//    }
//
//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println(">>>> setBeanFactory");
//    }
//
//    @Override
//    public void setBeanName(String name) {
//        System.out.println(">>>> setBeanName");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println(">>>> afterPropertiesSet");
//    }
//}
