package Practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class OST1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a2.txt"));
        Student s1 = new Student("zhangsan",18,"南京");
        Student s2 = new Student("lisi",18,"长沙");
        Student s3 = new Student("wangwu",18,"武汉");
        //当对象数目不确定时读取时越界会报错
        //为了防止报错，在写的时候把对象装进集合中
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,s1,s2,s3);
        oos.writeObject(list);
        oos.close();

    }
}
