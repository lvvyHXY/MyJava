package com.hxy.myreflect4;

public class Student {
    private String name;
    private int age;


    public Student() {
    }
    public Student(String name){
        this.name = name;
    }
    protected Student(int age){
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String eat(String something){
        System.out.println("再吃："+ something);
        return "aaa";
    }
    private void eat(String something,int i){
        System.out.println("再吃："+ something);
    }
    public void sleep() {
        System.out.println("在睡觉");
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
