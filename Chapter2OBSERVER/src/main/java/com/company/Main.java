package com.company;

import com.company.Classes.Displays.CurrentConditionsDisplay;
import com.company.Classes.Weather.WeatherData;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {

    public static void main(String[] args) throws UnirestException {
        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(wd);

        wd.autoRefresh(0, 30);
    }
}
