package ObjectStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a2.txt"));
        Student s1 = new Student("张三", 18,"北京");
        oos.writeObject(s1);
        oos.close();
        //报错：NotSerializableException，因为要使用序列化流的对象需要实现一个标记接口 Serializable
    }
}
