package com.day.thread.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/13 16:03
 * Version：1.0.0
 */
public class RejectExecutHandler {

    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 4, TimeUnit.SECONDS, queue, new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 10; i++) {
            final int j = i;
            threadPoolExecutor.execute(() -> {
                System.out.println(j);

            });

        }


    }
}
