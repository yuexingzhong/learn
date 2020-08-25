package com.example.designpattern.descign_pattern.observer_pattern.partOne;

import com.example.designpattern.descign_pattern.observer_pattern.partOne.show_black.CurrentConditionDisplay;
import com.example.designpattern.descign_pattern.observer_pattern.partOne.show_black.ForecastConditionDisplay;

/**
 * 标题、简要说明. <br>
 * 类详细说明
 * <p>
 * Date-Time：  2018/5/24  11:24
 * Company: 华宇(北京)信息服务有限公司
 * <p>
 *
 * @Author YUEXINGZHONG
 * @Version 1.0.0
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        ForecastConditionDisplay forecastConditionDisplay=new ForecastConditionDisplay(weatherData);

        weatherData.setWeatherData(80,65,30.4f);
        weatherData.setWeatherData(60,40,29.2f);
    }
}
