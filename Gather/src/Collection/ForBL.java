package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class ForBL {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");
        for (String s : coll) {
            //s只是临时变量，修改s不会修改集合元素
            System.out.println(s);
        }
        System.out.println("------------------------------------------");
        //Lambda表达式遍历(必须是函数式接口才能用Lambda表达式)
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        coll.forEach(s -> System.out.println(s));
    }
}
