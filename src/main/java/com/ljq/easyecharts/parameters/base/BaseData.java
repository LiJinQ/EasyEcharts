package com.ljq.easyecharts.parameters.base;

import java.util.List;

/**
 * @author ljq
 * @date 2020-08-07 10:08
 * @describe
 */
public class BaseData {
    private String name;
    private String type;
    private List<String> data;

    public BaseData() {
    }

    public BaseData(List<String> data) {
        this.data = data;
    }

    public BaseData(String name, String type, List<String> data) {
        this.name = name;
        this.type = type;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseData{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}
