import com.ljq.easyecharts.annotations.ChartsValue;
import com.ljq.easyecharts.annotations.XAxis;

/**
 * @author ljq
 * @date 2020-08-07 14:29
 * @describe
 */
public class Dog {

    @XAxis
    private String name;

    @ChartsValue
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
