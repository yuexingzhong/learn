package com.day.thread.day1;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2023/6/15 11:12
 * Version：1.0.0
 */
public class ThreadAttribute {


    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();


        new Thread(() -> {
            synchronized (o) {
                System.out.println("获取锁t1" + System.currentTimeMillis());
                try {
                    o.wait(2000);
                } catch (Exception e) {
                }
                System.out.println("锁t1继续执行" + System.currentTimeMillis());
            }
        }).start();
        Thread.sleep(2000);
        synchronized (o) {
            System.out.println("获取锁main" + System.currentTimeMillis());
        }
    }


}
