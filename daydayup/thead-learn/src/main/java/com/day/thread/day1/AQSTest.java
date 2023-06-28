package com.day.thread.day1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/6/28 14:04
 * Version：1.0.0
 */
public class AQSTest {

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock(true);
        lock.lock();
        lock.lockInterruptibly();
    }

}
