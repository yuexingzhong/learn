package com.day.thread.day1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2023/6/15 10:57
 * Version：1.0.0
 */
public class ThradCreateWay {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();


        Thread runnableThread = new Thread(() -> {
            System.out.println("123");
        });

        runnableThread.start();
        runnableThread.join();


        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        Thread callThread = new Thread(futureTask);
        callThread.start();
        callThread.join();
        System.out.println(futureTask.get());


    }


}


class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("123");
    }

}

class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        return "Success";
    }
}
