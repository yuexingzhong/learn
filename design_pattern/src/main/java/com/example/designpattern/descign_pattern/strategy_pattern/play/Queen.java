package com.example.designpattern.descign_pattern.strategy_pattern.play;

import com.example.designpattern.descign_pattern.strategy_pattern.play.weapon.impl.AxeBehavior;
import com.example.designpattern.descign_pattern.strategy_pattern.play.weapon.impl.KnifeBehavior;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/24  9:49
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class Queen extends Character {

    public Queen(){
        weaponBehavior=new KnifeBehavior();
    }
}
