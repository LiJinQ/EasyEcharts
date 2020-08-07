package com.ljq.easyecharts.parameters.base;

/**
 * @author ljq
 * @date 2020-08-07 15:43
 * @describe
 */
public class BaseDataSet {
    String x;
    String y;
    String z;
    String value;

    public BaseDataSet() {
    }

    public BaseDataSet(String x, String y, String z, String value) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.value = value;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
