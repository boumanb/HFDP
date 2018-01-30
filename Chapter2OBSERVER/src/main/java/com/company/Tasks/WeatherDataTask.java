package com.company.Tasks;

import com.company.Classes.Weather.WeatherData;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.TimerTask;

public class WeatherDataTask extends TimerTask {
    private final WeatherData weatherData;

    public WeatherDataTask(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void run() {
        try {
            weatherData.refreshMeasurements();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
