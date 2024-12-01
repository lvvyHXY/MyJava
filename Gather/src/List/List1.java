package List;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //add(index,element)
        list.add(1,"eee");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        //remove:1.元素 2.索引
        list.remove("aaa");
        list.remove("eee");
        list.forEach(s -> System.out.print(s + " "));
        //当集合中存的是Integer时，优先调用删index的
        //因为方法重载时优先调用实参形参类型一致的方法
        System.out.println();
        //set
        list.set(0,"qqq");
        list.forEach(s -> System.out.print(s + " "));
        System.out.println();
        //get
        System.out.println(list.get(0));
    }
}
