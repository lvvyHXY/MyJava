package FinalFunciton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class Demo1 {
    public static void main(String[] args) {
        //foreach
        //forEach形参是Consumer的泛型是传入的数据类型
        //accept的形参s表示stream流中的每一个数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"A","B","C","D","E");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("-----------------------------------------");
        //count
        System.out.println(list.stream().count());
        System.out.println("-----------------------------------------");
        //toArray:收集流中数据转入数组中
        Object[] objects = list.stream().toArray();
        for (Object o : objects) {
            System.out.println(o);
        }
        //IntFunction的泛型：一个具体类型的数组
        //toArray方法的形参：创建一个数组
        //apply形参：数组的长度，与集合长度一致
        //返回值：数组
        //toArray底层会把流里的每一个数据装入数组中
        list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println("-----------------------------------------");
        for (String s : list.stream().toArray(value -> new String[value])) {
            System.out.println(s);
        }

    }
}
