package com.day.thread.day1;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2023/6/16 14:30
 * Version：1.0.0
 */
public class CasThread {


    public static void main(String[] args) {
        ThreadLocal<String> a = new ThreadLocal<>();
        a.set("yxz");


        Thread thread = new Thread(() -> {
            System.out.println("线程隔离：" + a.get());
        });
        thread.start();

        System.out.println(a.get());


    }
}
