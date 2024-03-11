package com.day.thread.threadpool;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2024/3/8 17:50
 * Version：1.0.0
 */
public class ThreadDataMerge {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        threadPoolMethod();
        forkJoinMethod();

    }


    private static void forkJoinMethod() throws InterruptedException, ExecutionException {
        long l1 = System.currentTimeMillis();
        ForkJoinPool forkJoinPool = (ForkJoinPool) Executors.newWorkStealingPool();
        ForkJoinTask<Integer> submit = forkJoinPool.submit(new MyForkJoin(0, 10));

        //        time1(poolExecutor);
        System.out.println(submit.get());
        long l2 = System.currentTimeMillis();
        System.out.println("ThreadPool:time:" + (l2 - l1));
    }

    private static void threadPoolMethod() throws InterruptedException, ExecutionException {
        long l1 = System.currentTimeMillis();
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(10, 10, 6000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(10));
//        time1(poolExecutor);
        time2(poolExecutor);
        long l2 = System.currentTimeMillis();
        System.out.println("ThreadPool:time:" + (l2 - l1));
    }

    private static void time1(ThreadPoolExecutor poolExecutor) throws InterruptedException, ExecutionException {

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            Future<Integer> submit = poolExecutor.submit(new MyThread());
            sum += submit.get();
        }
        System.out.println(sum);
    }

    private static void time2(ThreadPoolExecutor poolExecutor) throws InterruptedException, ExecutionException {
        int sum = 0;
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Integer> submit = poolExecutor.submit(new MyThread());
            list.add(submit);
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).get();
        }
        long l2 = System.currentTimeMillis();
        System.out.println(sum);
    }


    static class MyThread implements Callable {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            return 1;
        }
    }


    static class MyForkJoin extends RecursiveTask<Integer> {
        //单个子任务处理5台车
        public static final int threshold = 1;

        int start, end;

        public MyForkJoin(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @SneakyThrows
        @Override
        protected Integer compute() {
            boolean canCompute = end - start <= threshold;
            if (canCompute) {
                Thread.sleep(1000);
                return 1;
            } else {
                int middle = (start + end) / 2;
                MyForkJoin leftTask = new MyForkJoin(start, middle);
                MyForkJoin rightTask = new MyForkJoin(middle, end);
                leftTask.fork();
                rightTask.fork();
                return (leftTask.join()) + (rightTask.join());
            }
        }
    }

}
