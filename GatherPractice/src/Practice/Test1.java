package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /* 班级里有N个学生，学生属性:姓名，年龄，性别。
        实现随机点名器。*/
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲","范建","范统","杜子腾","杜琦燕","宋合泛","侯笼藤","朱益群","朱穆朗玛峰","袁明媛");
        Random r = new Random();
        System.out.println(list.get(r.nextInt(list.size())));
        //或者打乱数据后取固定索引
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
