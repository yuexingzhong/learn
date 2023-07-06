package com.day.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/6 11:06
 * Version：1.0.0
 */
public class ReentrantReadWriteLockLearn {

    public static void main(String[] args) {

        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();

        writeLock.lock();
        System.out.println("主流程 拿到写锁 main");
        Thread thread1 = new Thread(() -> {
            readLock.lock();
            System.out.println("成功拿到读锁 t1");
        });

        Thread thread2 = new Thread(() -> {
            readLock.lock();
            System.out.println("成功拿到读锁 t2");
        });

        Thread thread3 = new Thread(() -> {
            readLock.lock();
            System.out.println("成功拿到读锁 t3");
        });

        Thread thread4 = new Thread(() -> {
            readLock.lock();
            System.out.println("成功拿到读锁 t4");
        });

        readLock.lock();
        System.out.println("主流程 拿到读锁 main");
        writeLock.unlock();
        System.out.println("主流程 释放写锁 main");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
