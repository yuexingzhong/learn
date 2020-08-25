package com.example.designpattern.descign_pattern.observer_pattern.partOne.show_black;

import com.example.designpattern.descign_pattern.observer_pattern.partOne.DisplayElement;
import com.example.designpattern.descign_pattern.observer_pattern.partOne.Observer;
import com.example.designpattern.descign_pattern.observer_pattern.partOne.Subject;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/24  11:19
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class ForecastConditionDisplay implements Observer, DisplayElement {

    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastConditionDisplay(Subject wd) {
        this.weatherData = wd;
        wd.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println("Current conditions:" + pressure + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        display();

    }
}
