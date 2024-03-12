package com.day.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2024/3/12 15:29
 * Version：1.0.0
 */
public class HashMapLearn {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        LinkedList arrayList1 = new LinkedList();
        arrayList1.add(null);

        HashMap map = new HashMap();
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
        map.put(null, null);
        objectObjectConcurrentHashMap.put(null, null);


        System.out.println("arraylist.size:" + arrayList.size() + ",linkedlist.size:" + arrayList1.size());


    }
}
