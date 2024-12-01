package ZiFuStream;

import java.io.FileReader;
import java.io.IOException;


public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        int len;
        char[] chars = new char[2];
        //有参的read自动强转装入char数组中
        while((len = fr.read(chars)) != -1){
            System.out.print(new String(chars,0,len));
        }
        fr.close();
    }
}
