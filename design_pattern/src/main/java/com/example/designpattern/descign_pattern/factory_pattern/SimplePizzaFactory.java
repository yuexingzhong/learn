package com.example.designpattern.descign_pattern.factory_pattern;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/8/8  14:21
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperonPizza();
        }
        return pizza;
    }


    public class Pizza {


        Pizza createPizza(String type) {
            return new Pizza();
        }
    }

    public class CheesePizza extends Pizza {

    }

    public class PepperonPizza extends Pizza {

    }
}
