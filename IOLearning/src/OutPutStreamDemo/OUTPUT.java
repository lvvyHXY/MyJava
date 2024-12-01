package OutPutStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class OUTPUT {
    public static void main(String[] args) throws IOException {
        //创建文件输出流对象
        //细节1：参数是字符串类型文件路径或者文件对象
        //细节2：如果文件不存在会创建新的文件，前提是文件的父级路径存在
        //细节3：如果文件已经存在则会清空文件
        FileOutputStream fos = new FileOutputStream("IOLearning\\a.txt");
        //调用write方法写入数据
        //细节：参数int：输入对应字符的ASCII码
        fos.write(97);
        //释放资源
        //不释放资源的话会一直占用文件的资源，每次写完之后都要释放
        fos.close();
    }
}
