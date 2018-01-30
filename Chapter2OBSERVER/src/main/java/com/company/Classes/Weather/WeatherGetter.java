package com.company.Classes.Weather;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

class WeatherGetter {
    private HttpResponse<JsonNode> jsonResponse;

    public WeatherGetter() throws UnirestException {
        refreshWeatherData();
    }

    private void refreshWeatherData() throws UnirestException {
        this.jsonResponse = Unirest.get("http://weerlive.nl/api/json-10min.php?locatie=Amsterdam")
                .asJson();
    }

    public JSONObject getJsonResponse() throws UnirestException {
        refreshWeatherData();
        JsonNode jsonResponseBody = this.jsonResponse.getBody();
        JSONObject jsonObject = jsonResponseBody.getObject();
        //noinspection SpellCheckingInspection
        return jsonObject.getJSONArray("liveweer").getJSONObject(0);
    }
}
