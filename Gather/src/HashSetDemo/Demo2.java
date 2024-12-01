package HashSetDemo;

import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("张三", 23);
        //创建哈希集合
        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
        //不重写hashcode和equals不能去重
        System.out.println(hs);
    }
}
