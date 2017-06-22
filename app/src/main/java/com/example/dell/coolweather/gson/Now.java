package com.example.dell.coolweather.gson;

/*
 * Created by Zoetan on 2017/6/22.
 */

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
