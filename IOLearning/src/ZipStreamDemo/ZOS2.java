package ZipStreamDemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZOS2 {
    public static void main(String[] args) throws IOException {
        //创建数据源
        File src =new File("D:\\aaa");
        //创建目的地,父级路径
        File destFather = src.getParentFile();
        //压缩包里的路径
        File dest = new File(destFather,src.getName() + ".zip");
        //创建压缩流对象关联输出流
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //文件夹压缩，要递归
        zip(src,zos,src.getName());
        //释放资源
        zos.close();
    }
    //第一个参数：数据源
    //第二个参数：压缩流，关联了压缩的位置
    //第三个参数：压缩包里的路径
    public static void zip(File src,ZipOutputStream zos,String name) throws IOException {
        //进入文件夹
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                //是文件：添加到压缩包里，拷贝文件内容
                //核心内容是下面的路径
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());//只有这么写才会有正确的路径
                zos.putNextEntry(entry);
                //拷贝
                FileInputStream fis = new FileInputStream(file);
                int b;
                while((b = fis.read()) != -1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();//停止添加对象
            }else {
                zip(file,zos,name + "\\" + file.getName());//第一个参数写file进入子级路径
            }
        }
    }

}
