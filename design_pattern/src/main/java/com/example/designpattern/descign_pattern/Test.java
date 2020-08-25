package com.example.designpattern.descign_pattern;

import java.lang.reflect.InvocationTargetException;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/10/26  19:02
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        User user = UserFactory.create();

        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}
