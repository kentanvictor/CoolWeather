package com.example.dell.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Zoetan on 2017/6/22.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }
    public  class More
    {
        @SerializedName("txt_d")
        public String info;
    }
}
