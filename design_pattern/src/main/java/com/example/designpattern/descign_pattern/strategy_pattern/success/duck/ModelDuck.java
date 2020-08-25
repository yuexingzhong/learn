package com.example.designpattern.descign_pattern.strategy_pattern.success.duck;

import com.example.designpattern.descign_pattern.strategy_pattern.success.fly.impl.FlyNoWay;
import com.example.designpattern.descign_pattern.strategy_pattern.success.quack.impl.MuteQuack;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/23  15:32
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }

    public void display(){
        System.out.println("我是一個白色鴨子");
    }
}
