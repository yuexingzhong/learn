package com.day.thread.DesignSingleton;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/30 18:06
 * Version：1.0.0
 */
public class Singleton1 {

    //懒汉
    private volatile static Singleton1 instance;

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

}
