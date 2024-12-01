package ImmutableGatherDemo;

import java.util.List;

public class ImmutableGather1 {
    public static void main(String[] args) {
        List<String> list = List.of("aaa", "bbb", "ccc");
        //可遍历，不可增删改
        for (String s : list) {
            System.out.print(s + " ");
        }
        //报错

        list.add("ddd");
    }
}
