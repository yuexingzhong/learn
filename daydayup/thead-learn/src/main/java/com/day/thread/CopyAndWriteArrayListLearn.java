package com.day.thread;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/26 14:06
 * Version：1.0.0
 */
public class CopyAndWriteArrayListLearn {

    public static void main(String[] args) {

        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        strings.add("1");

    }
}
