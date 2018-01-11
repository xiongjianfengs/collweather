package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xjf on 2018/1/11.
 */

public class County extends DataSupport{

    private int id;

    //区县名
    private String countyName;

    //区县所对应的天气
    private String weatherId;

    //当前县所属城市Id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
