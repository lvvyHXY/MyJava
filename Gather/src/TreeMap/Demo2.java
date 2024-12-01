package TreeMap;

import java.util.TreeMap;

public class Demo2 {
    //自定义类型的排序,实现泛型接口Comparable，重写compareTo
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 24);
        TreeMap<Student,String> tm = new TreeMap<>();
        tm.put(s1,"北京");
        tm.put(s2,"上海");
        tm.put(s3,"广州");
        System.out.println(tm);
    }
}
