package com.day.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/6/29 17:12
 * Version：1.0.0
 */
public class ReentrantLockLearn {


    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        System.out.println("主线程锁上了");
        lock.lock();

        Thread thread = new Thread(() -> {
            try {
                lock.lockInterruptibly();

                System.out.println("子线程锁上了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();

        System.out.println("主线程解锁了");


        lock.unlock();


    }
}
