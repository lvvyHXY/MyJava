package FinalFunciton;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class collectDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三-男-23","李四-女-24", "王五-男-25", "赵六-女-26", "田七-男-27");
        //收集到List集合中
        List<String> cl = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        cl.forEach(s -> System.out.println(s));
        System.out.println("------------------------------------------------------");
        //收集到set集合中，自动去重
        Set<String> cs = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        for (String string : cs) {
            System.out.println(string);
        }
        System.out.println("------------------------------------------------------");
        //收集到Map集合中
        //toMap 的两个参数：一个是键的规则，一个是值的规则
        //Function的泛型 <stream流中的类型，要存入map集合的类型>
        //apply的返回值类型是要存入map集合的类型，参数是stream流中的数据
        //调用toMap方法之前要先去重
        Map<String, Integer> cm = list.stream().collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[2]);
            }
        }));
        cm.forEach((s,integer) -> System.out.println(s + ":" + integer));
    }
}
