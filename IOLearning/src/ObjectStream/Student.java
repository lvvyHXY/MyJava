package ObjectStream;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {

    //设置一个常量serialVersionUID，因为你在序列化流写入文件后对类修改了以后serialVersionUID会变，为了反序列化时能正确读取，所以把serialVersionUID设置为常量
    @Serial
    private static final long serialVersionUID = 6901015053234780122L;
    private String name;
    private int age;
    //transient关键字表示这个变量不参与序列化,在反序列化时，这个变量的值为null
    private transient String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "{ name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
