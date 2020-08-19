package com.yxz.studyforspring.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by YUEXINGZHONG on 2020/8/19 16:58
 */
public class BeanLifeCycle implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ceshi init");
    }


    public void doSomething(){
        System.out.println("123");
    }
}
