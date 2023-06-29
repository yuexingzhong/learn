package com.day.thread.day1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/6/29 17:12
 * Version：1.0.0
 */
public class ReentrantLockLearn {


    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            condition.await();
            condition.signal();
        } finally {
            reentrantLock.unlock();
        }


    }
}
