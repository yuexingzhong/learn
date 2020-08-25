package com.example.designpattern.descign_pattern.strategy_pattern.success.duck;

import com.example.designpattern.descign_pattern.strategy_pattern.success.fly.FlyBehavior;
import com.example.designpattern.descign_pattern.strategy_pattern.success.quack.QuackBehavior;

/**
 * 公共鸭. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/23  11:25
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * 游泳
     */
    public void swim() {
        System.out.println("我会游泳");
    }


    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }


    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }

    /**
     * 外观
     */
    public void display() {
        System.out.println("我是黑的");
    }
}
