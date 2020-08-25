package com.example.designpattern.descign_pattern.proxy_pattern.dynamic_proxy;

/**
 * Created by YUEXINGZHONG on 2020/8/18 15:00
 */
public class DoSomeThing implements DoSomeService ,StarThingService{

    public void please(){
        System.out.println("邀请A明星参加我们的聚会");
    }

    @Override
    public void refuse() {
        System.out.println("A明星因事婉拒此次邀请");
    }
}
