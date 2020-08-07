import com.ljq.easyecharts.core.LineCharts;
import com.ljq.easyecharts.parameters.base.DataSet;
import com.ljq.easyecharts.parameters.base.line.BasicLineChart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ljq
 * @date 2020-08-07 14:23
 * @describe
 */
public class MainClass {

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("小白");
        dog.setSex("1");
        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        BasicLineChart basicLineChart = LineCharts.basicLineChart(dogs);
        System.out.println(basicLineChart);

    }
}
