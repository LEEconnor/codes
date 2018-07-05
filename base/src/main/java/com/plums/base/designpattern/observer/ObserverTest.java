package com.plums.base.designpattern.observer;

import com.plums.base.designpattern.observer.observer.CurrnetConditionsDisplay;
import com.plums.base.designpattern.observer.subject.WeatherData;

import java.util.Observer;

public class ObserverTest {

    public static void main(String[] args) {

        // 发送者
        WeatherData weatherData = new WeatherData();

        // 创建监听者
        new CurrnetConditionsDisplay(weatherData);

        weatherData.setMeasurements(1.1f,2.2f,3.3f);
    }

}
