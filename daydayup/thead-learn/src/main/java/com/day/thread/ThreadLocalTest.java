package com.day.thread;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/13 16:11
 * Version：1.0.0
 */
public class ThreadLocalTest {

    public static void main(String[] args) {
        ThreadLocal threadLocal=new ThreadLocal();
        threadLocal.remove();
    }
}
