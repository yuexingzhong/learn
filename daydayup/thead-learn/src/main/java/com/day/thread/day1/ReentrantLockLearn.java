package com.day.thread.day1;

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
        lock.lock();

        Thread thread = new Thread(() -> {
            lock.lock();
        });
        thread.setName("reentrantLock-trylcok");

        thread.start();
        thread.join();

        Thread.sleep(3000);
        lock.unlock();

    }
}
