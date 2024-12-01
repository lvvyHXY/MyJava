package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan,23","lisi,24","wangwu,25");
        list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) > 24).collect(Collectors.toMap(s-> s.split(",")[0],s-> Integer.parseInt(s.split(",")[1]))).forEach((s,integer)-> System.out.println(s + ":" + integer));
    }
}
