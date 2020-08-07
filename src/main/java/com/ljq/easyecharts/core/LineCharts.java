package com.ljq.easyecharts.core;

import com.ljq.easyecharts.parameters.base.DataSet;
import com.ljq.easyecharts.parameters.base.line.BasicLineChart;

import java.util.List;

/**
 * @author ljq
 * @date 2020-08-07 15:35
 * @describe
 */
public class LineCharts {

    public static <T> BasicLineChart basicLineChart(List<T> list) {
        DataSet dataSet = new DataSet<>(list);
        return new BasicLineChart(dataSet);
    }
}
