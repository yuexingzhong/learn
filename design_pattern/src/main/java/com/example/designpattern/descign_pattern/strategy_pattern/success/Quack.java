package com.example.designpattern.descign_pattern.strategy_pattern.success;

import com.example.designpattern.descign_pattern.strategy_pattern.success.quack.QuackBehavior;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/23  15:16
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我是如假包换会叫的");
    }
}
