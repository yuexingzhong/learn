package com.example.designpattern.descign_pattern.strategy_pattern.success;

import com.example.designpattern.descign_pattern.strategy_pattern.play.Character;
import com.example.designpattern.descign_pattern.strategy_pattern.play.Queen;
import com.example.designpattern.descign_pattern.strategy_pattern.play.weapon.impl.AxeBehavior;
import com.example.designpattern.descign_pattern.strategy_pattern.play.weapon.impl.BowAndArrowBehavior;
import com.example.designpattern.descign_pattern.strategy_pattern.play.weapon.impl.KnifeBehavior;
import com.example.designpattern.descign_pattern.strategy_pattern.play.weapon.impl.SwordBehavior;
import com.example.designpattern.descign_pattern.strategy_pattern.success.duck.Duck;
import com.example.designpattern.descign_pattern.strategy_pattern.success.duck.MallardDuck;
import com.example.designpattern.descign_pattern.strategy_pattern.success.duck.ModelDuck;
import com.example.designpattern.descign_pattern.strategy_pattern.success.fly.impl.FlyRocketPowered;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/23  15:18
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class MiniDuckSimulator {


    public static void main(String[] args) {
//        Duck mallard=new MallardDuck();
//        mallard.performFly();
//        mallard.performQuack();

//        Duck modelDuck=new ModelDuck();
//        modelDuck.setFlyBehavior(new FlyRocketPowered());
//        modelDuck.performFly();


        Character queen = new Queen();
        queen.attack();
        queen.setWeaponBehavior(new BowAndArrowBehavior());
        queen.attack();
        queen.setWeaponBehavior(new SwordBehavior());
        queen.attack();
        queen.setWeaponBehavior(new AxeBehavior());
        queen.attack();

    }

}
