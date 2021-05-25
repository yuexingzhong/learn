package com.example.designpattern.descign_pattern.strategy_pattern.success.duck;

import com.example.designpattern.descign_pattern.strategy_pattern.success.Quack;
import com.example.designpattern.descign_pattern.strategy_pattern.success.fly.impl.FlyWithWing;

/**
 * 绿头鸭. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/23  11:18
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }


}
