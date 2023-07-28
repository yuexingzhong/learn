package com.day.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/27 16:52
 * Version：1.0.0
 */
public class CyclicBarrierLearn {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
            System.out.println("线程到达");
        });


        new Thread(() -> {
            try {
                cyclicBarrier.await();
                System.out.println("1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                cyclicBarrier.await();
                System.out.println("2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                cyclicBarrier.await();
                System.out.println("3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }).start();



    }
}
