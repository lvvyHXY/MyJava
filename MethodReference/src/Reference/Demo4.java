package Reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo4 {
    //引用构造方法
    public static void main(String[] args) {
        //类名::new
        //集合储存姓名和年龄（字符串形式），把它封装成Student对象并装入集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三,23","李四,24","王五,25");
/*        List<Student> newList = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());*/
/*        System.out.println(newList);*/
        //new会报错是因为没有满足形参相同这个引用条件，所以得去Student里重载一个形参为String的构造方法
        List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList2);

    }
}
