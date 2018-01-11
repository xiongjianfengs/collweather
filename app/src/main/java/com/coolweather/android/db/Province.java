package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 省份类，存放全国各个省
 * Created by xjf on 2018/1/11.
 */

public class Province extends DataSupport{

    private int id;

    //省份名称
    private String provinceName;

    //省份代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
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
