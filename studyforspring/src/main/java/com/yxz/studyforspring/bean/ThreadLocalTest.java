package com.yxz.studyforspring.bean;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author YUEXINGZHONG  2020/11/2 10:16
 * @version V1.0.0
 */
public class ThreadLocalTest {

    static ThreadLocal<Integer> local = new ThreadLocal<>();

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 100, TimeUnit.SECONDS, null);


    }


}
