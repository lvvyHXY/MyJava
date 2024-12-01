package stu;

import stu.Student;
import stu.StudentOperator;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SetAge(19);
        System.out.println(s1.GetAge());
        Student s2 = new Student("111",59,30);
        //实体类的应用场景:只负责数据存取，不负责业务处理，业务处理交给其他类对象来完成实现数据与数据业务相分离。
        StudentOperator operator = new StudentOperator(s2);
        //静态方法用来做工具类，提高代码复用，方便调用
    }
}
