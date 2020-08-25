package com.example.designpattern.descign_pattern;

import java.lang.reflect.Method;

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
public class UserFactory {
    public static User create() {
        User user = new User();

        // 获取User类中所有的方法（getDeclaredMethods也行）
        Method[] methods = User.class.getMethods();

        try {
            for (Method method : methods) {
                // 如果此方法有注解，就把注解里面的数据赋值到user对象
                if (method.isAnnotationPresent(Init.class)) {
                    Init init = method.getAnnotation(Init.class);
                    method.invoke(user, init.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return user;
    }
}
