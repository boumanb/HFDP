package com.company.Classes.Weather;

import com.company.Interfaces.Observer;
import com.company.Interfaces.Subject;
import com.company.Tasks.WeatherDataTask;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Timer;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature, humidity, pressure;
    private WeatherGetter weatherGetter;

    public WeatherData() throws UnirestException {
        this.weatherGetter = new WeatherGetter();
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    private void measurementChanged() {
        notifyObservers();
    }

    public void refreshMeasurements() throws UnirestException {
        JSONObject liveWeather = this.weatherGetter.getJsonResponse();
        this.temperature = Float.parseFloat(liveWeather.getString("temp"));
        this.humidity = Float.parseFloat(liveWeather.getString("lv"));
        //noinspection SpellCheckingInspection
        this.pressure = Float.parseFloat(liveWeather.getString("luchtd"));
        measurementChanged();
    }

    public void autoRefresh(int delay, int period) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new WeatherDataTask(this), delay * 1000, period * 1000);
    }
}
