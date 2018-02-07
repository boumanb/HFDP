package com.company.Classes.Displays;

import com.company.Classes.Weather.WeatherData;
import com.company.Interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;
import com.company.Interfaces.Subject;

@SuppressWarnings("FieldCanBeLocal")
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature, humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}');
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
