package com.ljq.easyecharts.parameters.base;

import com.ljq.easyecharts.enumeration.AxisType;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ljq
 * @date 2020-08-07 13:34
 * @describe
 */
public class DataSet<T> {
    private List<String> xRow;
    private List<String> yRow;
    private List<String> zRow;
    private List<String> valueRow;
    private Map<String, String> valueMap;
    private List<BaseDataSet> baseDataSets;

    public DataSet(List<T> list) {
        xRow = new ArrayList<>(list.size());
        yRow = new ArrayList<>(list.size());
        zRow = new ArrayList<>(list.size());
        valueMap = new HashMap<>(list.size());
        valueRow = new ArrayList<>(list.size());
        baseDataSets = new ArrayList<>(list.size());
        for (T t : list) {
            String x = getTypeValue(AxisType.X, t);
            String y = getTypeValue(AxisType.Y, t);
            String z = getTypeValue(AxisType.Z, t);
            String value = getTypeValue(AxisType.VALUE, t);
            xRow.add(x);
            yRow.add(y);
            zRow.add(z);
            valueRow.add(value);
            String key = x + "_" + y + "_" + z;
            valueMap.put(key, value);
            BaseDataSet baseDataSet = new BaseDataSet(x, y, z, value);
            baseDataSets.add(baseDataSet);
        }
    }

    private String getTypeValue(AxisType axisType, T t) {
        String v = "";
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            //打开私有访问
            field.setAccessible(true);
            Object axis = field.getAnnotation(axisType.getClassType());
            if (axis != null) {
                String fieldName = field.getName();
                String firstLetter = fieldName.substring(0, 1).toUpperCase();
                String getter = "get" + firstLetter + fieldName.substring(1);
                Method method;
                try {
                    method = t.getClass().getMethod(getter);
                    v = "" + method.invoke(t);
                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    v = "";
                }
                return v;
            }
        }
        return v;
    }

    public List<String> getValueRow() {
        return valueRow;
    }

    public void setValueRow(List<String> valueRow) {
        this.valueRow = valueRow;
    }

    public List<BaseDataSet> getBaseDataSets() {
        return baseDataSets;
    }

    public void setBaseDataSets(List<BaseDataSet> baseDataSets) {
        this.baseDataSets = baseDataSets;
    }

    public List<String> getxRow() {
        return xRow;
    }

    public List<String> getyRow() {
        return yRow;
    }

    public List<String> getzRow() {
        return zRow;
    }

    public Map<String, String> getValueMap() {
        return valueMap;
    }
}
