package com.ljq.easyecharts.parameters.base.line;

import com.ljq.easyecharts.parameters.base.BaseData;
import com.ljq.easyecharts.parameters.base.DataSet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ljq
 * @date 2020-08-07 16:19
 * @describe
 */
public class BasicLineChart {
    private BaseData xAxis;
    private BaseData yAxis;
    private List<BaseData> series;

    public BasicLineChart(DataSet dataSet) {
        xAxis = new BaseData(dataSet.getxRow());
        xAxis.setType("category");
        yAxis = new BaseData();
        yAxis.setType("value");
        BaseData valueData = new BaseData(dataSet.getValueRow());
        valueData.setType("line");
        series = new ArrayList<>(1);
        series.add(valueData);
    }

    public BasicLineChart(BaseData xAxis, BaseData yAxis, List<BaseData> series) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.series = series;
    }

    public BaseData getxAxis() {
        return xAxis;
    }

    public void setxAxis(BaseData xAxis) {
        this.xAxis = xAxis;
    }

    public BaseData getyAxis() {
        return yAxis;
    }

    public void setyAxis(BaseData yAxis) {
        this.yAxis = yAxis;
    }

    public List<BaseData> getSeries() {
        return series;
    }

    public void setSeries(List<BaseData> series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "BasicLineChart{" +
                "xAxis=" + xAxis +
                ", yAxis=" + yAxis +
                ", series=" + series +
                '}';
    }
}
