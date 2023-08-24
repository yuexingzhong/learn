package com.day.thread;

import lombok.Synchronized;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/8/24 13:56
 * Version：1.0.0
 */
public class Singleton {
    //1、饿汉

    public Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }


    public static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }
}
