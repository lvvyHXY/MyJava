package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    /* 班级里有5个学生
       要求：
       被点到的学生不会再被点到。
       但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。*/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
        //可以把点到的人与集合末尾的元素换位置，然后之后的循环每一次随机的bound-1，这样可以做到并不重复，当最后bound为0时重置；
        int bound = list.size()-1;
        Random r = new Random();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第"+(i+1)+"轮点名开始了");
            for (String s : list) {
                if(bound == 0) {
                    System.out.println(list.get(0));
                    break;
                }
                int index = r.nextInt(bound);
                System.out.println(list.get(index));
                Collections.swap(list,index,bound);
                bound--;
            }
            bound = list.size()-1;
        }

        //还可以随机到一个删除一个，用remove
        //还可以shuffle以后直接遍历集合
        //
    }
}
