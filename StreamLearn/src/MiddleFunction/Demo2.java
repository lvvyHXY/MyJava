package MiddleFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        //distinct() 去重(利用hashcode（） 和 equals方法)
        //concat 连接stream流 它是Stream接口的静态方法 如果a，b类型不同，会自动提升到他们共同的父类，但这样就不能调他们独有的方法了
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三","张三","张三","张三", "李四", "王五", "赵六", "田七", "田七", "田七");
        list.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("---------------------------------------------------");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "月光她不懂白昼","眼花老头","jett");
        Stream.concat(list.stream(), list2.stream()).forEach(s -> System.out.println(s));//注意别传入两个集合，要传入两个流
    }
}
