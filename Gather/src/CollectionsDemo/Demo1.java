package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        System.out.println("------------------addAll------------------------");
        Collections.addAll(list, "aaa", "abc", "cde", "ddda","1234","qwer");
        System.out.println(list);
        //打乱集合元素
        System.out.println("------------------shuffle------------------------");
        Collections.shuffle(list);
        System.out.println(list);
        //排序
        System.out.println("------------------sort------------------------");
        Collections.sort(list);
        System.out.println(list);
        //按规则排序
        System.out.println("------------------LambdaSort------------------------");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = o2.length() - o1.length();
                i = i == 0? o1.compareTo(o2) : i;
                return i;
            }
        });
        System.out.println(list);
        /*System.out.println("------------------fill------------------------");
        Collections.fill(list,"123");
        System.out.println(list);*/
        System.out.println("------------------max/min------------------------");
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println("------------------swap------------------------");
        System.out.println(list);
        System.out.println("交换后");
        Collections.swap(list,0,3);
        System.out.println(list);

    }
}
