package com.day.thread;

import java.util.concurrent.Semaphore;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/10/30 14:11
 * Version：1.0.0
 */
public class SemaphoreLearn {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(10);
        
        Thread t1=new Thread();
        Thread t2=new Thread();
        
        t1.start();
        t2.start();
        int permits = 5;
        System.out.println(Thread.currentThread().getName() + " trying to acquire");
        try {
            semaphore.acquire(permits);
            System.out.println(Thread.currentThread().getName() + " acquire successfully");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " release successfully");
        }
 
        
        
    }
}
