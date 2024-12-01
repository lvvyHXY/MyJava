package MiddleFunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {
        // map 转换流中的数据类型 
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"月光她不懂白昼-399","3MZ-1580","Pite-2690");
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s){
                String[] arr = s.split("-");//split()方法返回的是一个数组
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(i -> System.out.println(i));

        System.out.println("_-------------------------------_");
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(i -> System.out.println(i));
    }
}
