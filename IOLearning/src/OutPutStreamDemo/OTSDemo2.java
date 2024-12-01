package OutPutStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class OTSDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Java\\IOLearning\\a.txt");
        //write 参数可以是：单个int；byte数组；byte数组，起始索引，个数
        fos.write(97);

        byte[] b = {97,98,99,100};
        fos.write(b);

        fos.write(b,1,3);
        //但是要注意，每一次运行都会先清空文件，因为已经存在了
        fos.close();
    }
}
