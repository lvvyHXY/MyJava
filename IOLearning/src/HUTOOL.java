import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HUTOOL {
    public static void main(String[] args) {
        File file = FileUtil.file("D:\\","bbb","a.txt");//可变参数，可以一次创建多级路径的File对象
        System.out.println(file);//IOLearning\ccc\bbb\a.txt
        File touch = FileUtil.touch(file);//根据路径创建文件
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc");
        FileUtil.writeLines(list,touch,"UTF-8");//把集合里的数据写入文件，覆盖
        FileUtil.appendLines(list,touch,"UTF-8");//把集合里的数据写入文件，续写
        List<String> strings = FileUtil.readLines(touch, "UTF-8");
        System.out.println(list);//一行数据是集合里的一个元素
    }
}
