package StreamHuoQu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "田七");
        //单列集合通过Collection中的默认方法获取stream流，直接.stream即可
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        list.stream().forEach(s -> System.out.println(s));
    }
}
