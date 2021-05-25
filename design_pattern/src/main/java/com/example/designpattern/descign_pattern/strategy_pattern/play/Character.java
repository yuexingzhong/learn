package com.example.designpattern.descign_pattern.strategy_pattern.play;

import com.example.designpattern.descign_pattern.strategy_pattern.play.weapon.WeaponBehavior;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/24  9:44
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class Character {

    WeaponBehavior weaponBehavior;


    public void attack() {
        weaponBehavior.attack();
    }

    public void setWeaponBehavior(WeaponBehavior wb) {
        System.out.println("稍等......我不行 ----我换把武器");
        weaponBehavior = wb;
    }


}
