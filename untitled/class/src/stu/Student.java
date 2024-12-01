package stu;

public class Student {
    private String name;
    //隐藏：其他任何地方不能直接访问，只有类中能访问
    private int age;
    private double score;
    //如何暴露（合理隐藏,合理暴露），用public修饰的get set方法合理暴露

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public Student() {
    }

    public int GetAge()
    {
        return age;
    }
    public void SetAge(int age)
    {
        if(age>=0 && age<=200)
            this.age = age;
        else
            System.out.println("年龄非法");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
