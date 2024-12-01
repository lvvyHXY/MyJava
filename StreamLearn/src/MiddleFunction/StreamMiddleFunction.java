package MiddleFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamMiddleFunction {
    public static void main(String[] args) {
        //filter 过滤
        //limit 获取前几个元素
        //skip 跳过几个元素
        //tips:每一个中间方法调用之后返回一个新的stream，每一个stream都只能调用一次方法，所以建议使用链式编程
        //修改Stream流中的数据不会影响原来集合中的数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "田七","王十一");
        list.stream().filter(s -> s.startsWith("王")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        System.out.println("---------------------------------------------------------");
        //limit
        list.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("---------------------------------------------------------");
        //skip
        list.stream().skip(4).forEach(s -> System.out.println(s));
    }
}
