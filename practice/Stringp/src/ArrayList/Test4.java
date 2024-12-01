package ArrayList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("lisi", 13);
        Student s3 = new Student("wangwu", 26);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getAge());
            System.out.print(list.get(i).getName());
            System.out.println();
        }
    }
}
