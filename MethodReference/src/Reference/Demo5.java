package Reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","dddd","eee");
/*
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));
*/
/*public String toUpperCase() {
        return toUpperCase(Locale.getDefault());
    }*/
        //但是此处根据方法引用来看，被引用的函数形参与被引用处不一致（一个是String 一个空）
        //但是它能引用成功
        //因为它是根据抽象函数引用规则来的
        //抽象方法形参：
        //1.第一个参数表示被引用方法的调用者，决定了可以引用哪些类中的方法。
        // 比如stream流中的第一个参数就是流中的每一个数据，比如上式是String类型，所以只能引用String里的方法
        //2.第二个参数到最后一个参数与被引用方法的形参保持一致，如果没有第二个形参就是空参（本例就是）

        //局限性
        //1.不能引用所有类的成员方法
        //2.函数的第一个参数决定了只能引用哪些类中的方法

        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
