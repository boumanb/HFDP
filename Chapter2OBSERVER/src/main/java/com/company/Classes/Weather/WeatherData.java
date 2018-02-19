package com.company.Classes.Weather;

import com.company.Interfaces.Observer;
import com.company.Tasks.WeatherDataTask;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Timer;

@SuppressWarnings("deprecation")
public class WeatherData extends Observable{
    private ArrayList<Observer> observers;
    private float temperature, humidity, pressure;
    private WeatherGetter weatherGetter;

    public WeatherData() throws UnirestException {
        this.weatherGetter = new WeatherGetter();
    }

    private void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public void refreshMeasurements() throws UnirestException {
        JSONObject liveWeather = this.weatherGetter.getJsonResponse();

        float temp = Float.parseFloat(liveWeather.getString("temp"));
        float humidity = Float.parseFloat(liveWeather.getString("lv"));
        float airpressure = Float.parseFloat(liveWeather.getString("luchtd"));
        boolean changes = false;

        if (this.temperature != temp) {
            this.temperature = temp;
            changes = true;
        }

        if (this.humidity != humidity) {
            this.humidity = humidity;
            changes = true;
        }

        if (this.pressure != airpressure) {
            this.pressure = airpressure;
            changes = true;
        }
        
        if (changes) {
            measurementChanged();
        }

    }

    public void autoRefresh(int delay, int period) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new WeatherDataTask(this), delay * 1000, period * 1000);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

}
