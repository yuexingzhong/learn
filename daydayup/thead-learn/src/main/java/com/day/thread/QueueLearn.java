package com.day.thread;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/5 10:10
 * Version：1.0.0
 */
public class QueueLearn {

    public static void main(String[] args) throws InterruptedException {

//        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
//
//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//
//        queue.put("4");
//        queue.remove();
//
//        queue.put("4");

        Queue queue = new LinkedBlockingDeque<String>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.poll());
        }

    }
}
