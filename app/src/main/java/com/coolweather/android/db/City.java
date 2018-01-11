package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xjf on 2018/1/11.
 */

public class City extends DataSupport{

    private int id;

    //城市名称
    private String cityName;

    //城市代号
    private int cityCode;

    //所属省份id
    private int provinceid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }
}
