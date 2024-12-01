package ImmutableGatherDemo;

import java.util.Set;

public class SetImuualbe {
    public static void main(String[] args) {
        Set<String> set = Set.of("aaa", "bbb", "ccc");
        //可以遍历
        set.forEach(s -> System.out.print(s + " "));
        //不可增删
        set.add("ddd");
    }
}
