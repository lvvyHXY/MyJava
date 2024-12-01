package ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FanDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a2.txt"));
        Student s = (Student) ois.readObject();
        System.out.println(s);
        ois.close();
    }
}
