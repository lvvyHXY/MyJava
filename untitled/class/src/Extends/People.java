package Extends;

public class People {
    //需求：帮我写一个人类，包含姓名，年龄，性别
    private String name;
    private int age;
    private char gender;
    public People()
    {

    }
    public People(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public char getGender()
    {
        return gender;
    }
    public void setGender(char gender)
    {
        this.gender=gender;
    }
}
