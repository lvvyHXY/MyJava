package OutPutStreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OSTDemo3 {
    public static void main(String[] args) throws IOException {
        //关于续写，可以在创建文件输出流对象的时候，添加一个参数，true表示续写，false表示覆盖
        FileOutputStream fos = new FileOutputStream("D:\\Java\\IOLearning\\a.txt",true);
        //写入数据
        String str = "GoodByeMelodyRose";
        byte[] b1 = str.getBytes();
        fos.write(b1);
        //换行只需要输入换行符即可：Windows：\r\n  Mac：\r  Linux：\n
        String str2 = "\r\n";
        byte[] b2 = str2.getBytes();
        fos.write(b2);
        fos.write(b1);
        fos.close();
    }
}
