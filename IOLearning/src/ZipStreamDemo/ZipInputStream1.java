package ZipStreamDemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStream1 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\src.zip");
        File dest = new File("D:\\dest");
        unzip(src,dest);
    }
    public static void unzip(File src,File dest) throws IOException {
        //创建解压流对象读取每一个文件,每一个文件、文件夹都是一个ZipEntry对象
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry;
        //循环读取
        while((entry = zis.getNextEntry()) != null){
            System.out.println(entry);
            //是文件夹怎么办:在目的地创建一个同名文件夹
            if(entry.isDirectory()){
                File dir = new File(dest,entry.toString());
                dir.mkdirs();
            }else {
                //拷贝需要文件输出流，用解压流读就行
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while((b = zis.read()) != -1){
                    fos.write(b);
                }
                fos.close();
            }
        }
        zis.close();

    }
}
