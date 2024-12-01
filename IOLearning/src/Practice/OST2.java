package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class OST2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //读取数据
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a2.txt"));
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        ois.close();
    }
}
