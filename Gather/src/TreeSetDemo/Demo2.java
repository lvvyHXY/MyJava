package TreeSetDemo;

import HashSetDemo.Student;

import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        //1.默认排序
        //实现comparable<>接口，重写compareTo方法
        System.out.println(ts);
    }
}
