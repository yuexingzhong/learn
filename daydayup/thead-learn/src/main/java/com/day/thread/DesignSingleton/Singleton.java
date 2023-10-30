package com.day.thread.DesignSingleton;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/24 13:56
 * Version：1.0.0
 */
public class Singleton {
    //懒汉
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

}
