package com.day.thread.day1;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchornizedTest {


    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock(false);

        lock.lock();

        Thread thread = new Thread(() -> {
            lock.lock();
        });
        thread.setName("reentrant-acquire-lock-thread");
        thread.start();
        thread.join();
        lock.unlock();

    }
}
