package com.day.thread;

import java.util.Calendar;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/9/4 10:05
 * Version：1.0.0
 */
public class DelayThread {


    public static void main(String[] args) {

        DelayQueue<DelayedTask> delayedTasks = new DelayQueue<>();

        delayedTasks.add(new DelayedTask("1", 2));
        delayedTasks.add(new DelayedTask("2", 2));
        delayedTasks.add(new DelayedTask("3", 2));
        delayedTasks.add(new DelayedTask("4", 2));

        while (!delayedTasks.isEmpty()) {





        }


    }


    static class DelayedTask implements Runnable, Delayed {
        private String name;

        private int _expireInSecond = 0;

        public DelayedTask(String name, int delaySecond) {
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.SECOND, delaySecond);
            _expireInSecond = (int) (cal.getTimeInMillis() / 1000);
        }

        public int compareTo(Delayed o) {
            long d = (getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS));
            return (d == 0) ? 0 : ((d < 0) ? -1 : 1);
        }

        public long getDelay(TimeUnit unit) {
            Calendar cal = Calendar.getInstance();
            return _expireInSecond - (cal.getTimeInMillis() / 1000);
        }

        @Override
        public void run() {
            System.out.println(System.currentTimeMillis());
        }
    }

}
