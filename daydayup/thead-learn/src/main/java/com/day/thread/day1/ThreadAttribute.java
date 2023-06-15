package com.day.thread.day1;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2023/6/15 11:12
 * Version：1.0.0
 */
public class ThreadAttribute {


    private static int a = 0;

    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                a++;
            }
        });


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                a++;
            }
        });

        thread1.start();

        thread2.start();

        thread2.join();
        thread1.join();

        System.out.println(a);
    }


}
