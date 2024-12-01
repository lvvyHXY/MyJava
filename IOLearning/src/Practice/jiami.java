package Practice;

import java.io.*;

public class jiami {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("ency.txt");
        int len;
        while((len = fis.read()) != -1){
            fos.write(len^10);
        }
        fis.close();
        fos.close();
        reduction(new File("ency.txt"));
    }
    public static void reduction(File f) throws IOException {
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos = new FileOutputStream("decy.txt");
        int len;
        while((len = fis.read()) != -1){
            fos.write(len^10);
        }
        fis.close();
        fos.close();
    }
}
