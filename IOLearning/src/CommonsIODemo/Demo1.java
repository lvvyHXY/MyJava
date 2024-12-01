package CommonsIODemo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo1 {
    /*
FileUtils类
    static void copyFile(File srcFile, File destFile)                 复制文件
    static void copyDirectory(File srcDir, File destDir)             复制文件夹,aaa,bbb:把aaa中的文件放到bbb
    static void copyDirectoryToDirectory(File srcDir, File destDir)  复制文件夹，aaa，bbb：把aaa文件夹放到bbb中
    static void deleteDirectory(File directory)                      删除文件夹
    static void cleanDirectory(File directory)                       清空文件夹
    static String readFileToString(File file, Charset encoding)      读取文件中的数据变成字符串
    static void write(File file, CharSequence data, String encoding) 写出数据

IOUtils类
    public static int copy(InputStream input, OutputStream output)   复制文件
    public static int copyLarge(Reader input, Writer output)         复制大文件
    public static String readLines(Reader input)                     读取数据
    public static void write(String data, OutputStream output)       写出数据
*/
    public static void main(String[] args) throws IOException {
        File src = new File("a.txt");
        File dest = new File("copy.txt");
        FileUtils.copyFile(src,dest);
    }
}
