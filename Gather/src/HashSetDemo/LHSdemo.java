package HashSetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LHSdemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("张三", 23);
        //创建哈希集合
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));
        //不重写hashcode和equals不能去重
        //LinkedHasSet有序
        System.out.println(lhs);
    }
}
