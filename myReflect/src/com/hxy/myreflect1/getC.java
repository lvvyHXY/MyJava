package com.hxy.myreflect1;

public class getC {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName("全类名")
        //全类名 = 包名＋类名
        //最常用
        Class cs1 = Class.forName("com.hxy.myreflect1.Student");
        System.out.println(cs1);
        //类名.class
        //当参数传递
        Class<Student> cs2 = Student.class;
        System.out.println(cs1 == cs2);
        //对象名.getClass
        Student s = new Student();
        Class<? extends Student> cs3 = s.getClass();
        System.out.println(cs3 == cs2);
    }
}
