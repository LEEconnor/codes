package com.plums.base.designpattern.observer.subject;


import lombok.Data;

import java.util.Observable;

/**
 * 天气发布主题
 * */
@Data
public class WeatherData extends Observable {

    private Float temperature;

    private Float humidity;

    private Float pressurely;

    /** 测量到的值改变时 需要做的事情 */
    private void measurementsChanged(){
        setChanged();
        // 无参时表示观察这自己拉取数据 在观察者update方法中，观察者自己取想要的数据
        // 有参数时 我们将参数中的内容推送给观察者 观察者再从我们推送的数据中取自己所需
        notifyObservers();
    }

    public void setMeasurements (Float temperature, Float humidity , Float pressurely){
        this.humidity = humidity;
        this.pressurely = pressurely;
        this.temperature =temperature;
        measurementsChanged();
    }


}
