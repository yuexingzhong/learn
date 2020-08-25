package com.example.designpattern.descign_pattern.observer_pattern.partOne;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/24  11:06
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public interface Observer {

    /**
     * 更新显示板数据
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temp, float humidity, float pressure);
}
