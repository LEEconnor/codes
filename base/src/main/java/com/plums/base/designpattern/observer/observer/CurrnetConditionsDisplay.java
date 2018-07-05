package com.plums.base.designpattern.observer.observer;

import com.plums.base.designpattern.observer.subject.WeatherData;
import lombok.ToString;

import java.util.Observable;
import java.util.Observer;

/**
 * 某一个观察者
 */
@ToString(exclude = "observable")
public class CurrnetConditionsDisplay implements Observer {


    private Float temperature;

    private Float humidity;

    private Observable observable;

    public CurrnetConditionsDisplay(Observable observable) {
        // 保有主题 并在主题侧注册
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     *  更新数据
     * */
    @Override
    public void update(Observable o, Object arg) {
        // 如果是我们需要的主题
        if( o instanceof WeatherData){
            humidity = ((WeatherData) o).getHumidity();
            temperature = ((WeatherData) o).getTemperature();
            display();
        }
    }

    private void display() {
        System.out.println(" this is CurrentConditionDisplay ! ");
        toString();
    }
}
