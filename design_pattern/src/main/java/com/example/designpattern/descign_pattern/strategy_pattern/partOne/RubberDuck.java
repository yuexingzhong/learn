package com.example.designpattern.descign_pattern.strategy_pattern.partOne;

/**
 * 橡皮鸭. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/23  11:21
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class RubberDuck  extends Duck{

    //重载父类方法重写为吱吱叫
    @Override
    public void quack() {

    }

    //覆盖飞翔的方法，因为橡皮鸭不会飞
    @Override
    public void fly() {

    }
}
