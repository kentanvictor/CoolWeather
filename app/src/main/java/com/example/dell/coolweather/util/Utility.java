package com.example.dell.coolweather.util;

import android.text.TextUtils;

import com.example.dell.coolweather.db.City;
import com.example.dell.coolweather.db.County;
import com.example.dell.coolweather.db.province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Created by Zoetan on 2017/6/20.
 */
//Parsing and processing the data
public class Utility {
    /**
     * parsing and processing the province data from the server
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvicnes = new JSONArray(response);
                //Use JSONArray to parse the data
                for (int i = 0; i < allProvicnes.length(); i++) {
                    JSONObject provinceObject = allProvicnes.getJSONObject(i);
                    //Use JSONObject to parse the data
                    province province = new province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * parsing and processing the city data from the server
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * parsing and processing the county data from the server
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWertherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}