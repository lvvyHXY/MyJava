package ExceptionDemo;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        int len = name.length();
        if(len <2 || len>10){
            throw new NameFormatException(name + "格式有误，长度应为2~10");
        }
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
        if(age < 18 || age > 40){
            throw new AgeOutOfBoundsException(age + "年龄超出范围");
        }else
        {
            this.age = age;
        }
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
