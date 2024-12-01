package Practice;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //对象，目的地
        File f1 = new File("D:\\src");
        File f2 = new File("D:\\dest");
        copyDirectory(f1,f2);
    }
    public static void copyDirectory(File f1,File f2) throws IOException {
        //如果不存在则创建，存在则创建失败
        f2.mkdirs();
        //递归
        //进入数据源
        //遍历所有文件夹
        File[] files = f1.listFiles();
        for (File file : files) {
            if(file.isFile()){
                //判断文件拷贝数据，从文件开始，从文件结束，fos不能写文件夹，要创建一个同名文件
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(new File(f2,file.getName()));//在此处要创建一个文件对象
            byte[] b = new byte[1024];
            int len;
            while((len = fis.read()) != -1){
                fos.write(b,0,len);
            }
            //关流释放资源
            fis.close();
            fos.close();
            }else {
                //递归，要进入子级路径
            copyDirectory(file,new File(f2,file.getName()));
        }
        }
    }
}
