package com.day.thread;

import org.LatencyUtils.TimeServices;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/13 16:11
 * Version：1.0.0
 */
public class ThreadLocalTest {

    public static void main(String[] args) {

        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadPoolExecutor.DiscardOldestPolicy());

        AtomicInteger atomicInteger = new AtomicInteger();


        scheduledThreadPoolExecutor.scheduleWithFixedDelay(() -> {

            scheduledThreadPoolExecutor.shutdown();

        }, 1, 60, TimeUnit.SECONDS);

    }
}
