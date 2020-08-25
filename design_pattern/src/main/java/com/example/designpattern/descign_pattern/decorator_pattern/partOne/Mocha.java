package com.example.designpattern.descign_pattern.decorator_pattern.partOne;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/6/1  17:11
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return beverage.description+",mocha";
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
