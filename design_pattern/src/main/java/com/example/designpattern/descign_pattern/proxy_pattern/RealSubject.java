package com.example.designpattern.descign_pattern.proxy_pattern;

/**
 * Created by YUEXINGZHONG on 2020/8/18 14:46
 */
public class RealSubject extends Subject{
    @Override
    public void request() {
        System.out.println("正式的去邀请");
    }
}
