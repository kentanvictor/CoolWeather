package com.example.dell.coolweather.gson;

/*
 * Created by Zoetan on 2017/6/22.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String api;
        public String pm25;
    }
}
