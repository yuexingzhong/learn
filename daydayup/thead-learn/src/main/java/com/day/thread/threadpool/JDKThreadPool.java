package com.day.thread.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/12 9:13
 * Version：1.0.0
 */
public class JDKThreadPool {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        System.out.println(list.subList(0, list.size()));

    }
}
