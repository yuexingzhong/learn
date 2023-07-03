package com.day.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/6/29 17:12
 * Version：1.0.0
 */
public class ReentrantLockLearn {

    private static Lock lock = new ReentrantLock();


    public static void main(String[] args) throws InterruptedException {
        lock.tryLock(10, TimeUnit.SECONDS);

        throw new RuntimeException();

    }
}
