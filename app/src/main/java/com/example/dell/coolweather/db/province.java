package com.example.dell.coolweather.db;

import org.litepal.crud.DataSupport;

/*
 * Created by Zoetan on 2017/6/19.
 */
//id是每個實體類中都應該有的字段,provinceName記錄省的名字.provinceCode記錄省的代號.

public class province extends DataSupport{
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName()
    {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
