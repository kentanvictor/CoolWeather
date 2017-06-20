package com.example.dell.coolweather.Fragment;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dell.coolweather.db.City;
import com.example.dell.coolweather.db.County;
import com.example.dell.coolweather.db.province;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2017/6/20.
 */

public class ChooseAreaFragment extends Fragment {
    public static final int LEVEL_PROVINCE = 0;
    public static final int LEVEL_CITY = 1;
    public static final int LEVEL_COUNTY = 2;
    private ProgressDialog progressDialog;
    private TextView titleText;
    private Button backButton;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> dataList = new ArrayList<>();
    /**
     * provinces table
    */
    private List<province> provinceList;
    /**
     * cities table
     */
    private List<City> cityList;
    /**
     * counties table
     */
    private List<County> countyList;
    /**
     * selected Province
     */
    private province selectedProvince;
    /**
     * selected City
     */
    private City selectedCity;
    /**
     * The currently selected level
     */
    private int currentLevel;
}
