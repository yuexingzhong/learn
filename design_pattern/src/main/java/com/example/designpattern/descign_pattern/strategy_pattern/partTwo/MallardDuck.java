package com.example.designpattern.descign_pattern.strategy_pattern.partTwo;

import com.example.designpattern.descign_pattern.strategy_pattern.partOne.Duck;
import org.springframework.beans.factory.annotation.Autowired;

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

    @Autowired
     Quackable quackable;

    public void quack(){
        quackable.quack();
    }

}
