package com.example.dell.coolweather.db;

import org.litepal.crud.DataSupport;

/*
 * Created by Zoetan on 2017/6/19.
 */
//countyName記錄縣的名字.weatherId記錄縣對應的天氣id.cityId記錄當前縣所在市的id值
public class County extends DataSupport {
    private int id;

    private String countyName;

    private int cityId;

    private String wertherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWertherId() {
        return wertherId;
    }

    public void setWertherId(String wertherId) {
        this.wertherId = wertherId;
    }
}
