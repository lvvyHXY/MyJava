package ZipStreamDemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZOS {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\a.txt");
        File dest = new File("D:\\");
        zip(src,dest);
    }
    public static void zip(File src,File dest) throws IOException {
        //获取文件，创建压缩流对象，把文件当作ZipEntry对象放入压缩包里面，然后还要拷贝文件里的数据
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        //注意：此处的路径是相对于压缩包的路经，你写bbb\\ccc\\a.txt压缩包里会呈现bbb文件夹里有ccc文件夹里面是a.txt
        ZipEntry entry = new ZipEntry("bbb\\a.txt");
        zos.putNextEntry(entry);
        System.out.println(entry);
        //放入之后拷贝,从数据源src处
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read()) != -1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
        fis.close();
    }

}
