package com.example.designpattern.descign_pattern.observer_pattern.partOne;

import java.util.ArrayList;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/24  11:10
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 注册观察者
     *
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    /**
     * 移除观察者
     *
     * @param o
     */
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知目前在职的观察者
     */
    public void noticeObservers() {

        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    /**
     * 数据重新测量时被调用(我们不care什么时候调用)
     */
    public void measurementsChange() {
        noticeObservers();
    }


    public void setWeatherData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }
}
