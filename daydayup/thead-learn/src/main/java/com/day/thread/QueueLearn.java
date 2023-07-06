package com.day.thread;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2023/7/5 10:10
 * Version：1.0.0
 */
public class QueueLearn {

    public static void main(String[] args) throws InterruptedException {

//        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
//
//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//
//        queue.put("4");
//        queue.remove();
//
//        queue.put("4");

//        Queue queue = new LinkedBlockingDeque<String>();
//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//        queue.add("4");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(queue.poll());
//        }
        Queue a = new PriorityQueue<String>();

        a.add("1");
        a.add("2");
        a.add("5");
        a.add("3");


        System.out.println(a.poll());
        System.out.println(a.poll());
        System.out.println(a.poll());
        System.out.println(a.poll());


        Queue a1 = new PriorityQueue<Person>(10, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        a1.add(new Person("张11", 1));
        a1.add(new Person("张22", 2));
        a1.add(new Person("张55", 5));
        a1.add(new Person("张33", 3));
        a1.add(new Person("张44", 4));

        System.out.println(a1.poll().toString());
        System.out.println(a1.poll().toString());
        System.out.println(a1.poll().toString());
        System.out.println(a1.poll().toString());
        System.out.println(a1.poll().toString());
        System.out.println(a1.poll().toString());
        System.out.println(a1.poll().toString());

    }
}
