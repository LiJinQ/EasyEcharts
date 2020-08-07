package com.ljq.easyecharts.enumeration;

import com.ljq.easyecharts.annotations.ChartsValue;
import com.ljq.easyecharts.annotations.XAxis;
import com.ljq.easyecharts.annotations.YAxis;
import com.ljq.easyecharts.annotations.ZAxis;

/**
 * @author ljq
 * @date 2020-08-07 13:37
 * @describe
 */
public enum AxisType {
    /*
    数据类型
     */
    X(XAxis.class),Y(YAxis.class),Z(ZAxis.class),VALUE(ChartsValue.class);
    private Class classType;
    private AxisType(Class classType){
        this.classType = classType;
    }

    public Class getClassType() {
        return classType;
    }

    public void setClassType(Class classType) {
        this.classType = classType;
    }
}
