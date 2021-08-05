package com.yxz.studyforspring.bean;

import org.openjdk.jol.info.ClassLayout;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2021/7/22 9:25
 * Version：1.0.0
 */
public class ClassBean {


    static class Ts{

    }

    public static void main(String[] args) {
        Ts s=new Ts();
        System.out.println(ClassLayout.parseInstance(s).toPrintable());
    }
}
