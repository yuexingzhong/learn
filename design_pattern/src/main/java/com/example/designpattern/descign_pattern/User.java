package com.example.designpattern.descign_pattern;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/10/26  19:01
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    @Init(value = "liang")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    @Init(value = "23")
    public void setAge(String age) {
        this.age = age;
    }

}
