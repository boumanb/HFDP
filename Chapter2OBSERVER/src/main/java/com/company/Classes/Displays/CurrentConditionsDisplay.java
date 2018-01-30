package com.company.Classes.Displays;

import com.company.Interfaces.DisplayElement;
import com.company.Interfaces.Observer;
import com.company.Interfaces.Subject;

@SuppressWarnings("FieldCanBeLocal")
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature, humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}');
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
