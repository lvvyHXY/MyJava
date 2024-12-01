package Properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //Properties是一个Map集合，但是它的键值一般都是String类型
        readProperties();
        //writeProperties();
    }
    public static void readProperties() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("D:\\Java\\IOLearning\\src\\Properties\\a.properties");
        prop.load(fis);
        System.out.println(prop);
        fis.close();
    }
    public static void writeProperties() throws IOException {
        Properties prop = new Properties();
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        FileWriter fw = new FileWriter("D:\\Java\\IOLearning\\src\\Properties\\a.properties");
        prop.store(fw,"test");
        fw.close();
    }
}
