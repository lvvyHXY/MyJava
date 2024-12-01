package Reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo66 {
    public static void main(String[] args) {
        //把集合中的一些数据存入数组当中
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
/*
        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
*/
        //引用的数组构造方法的数组类型必须与流中的数据类型一致
        Integer[] array = list.stream().toArray(Integer[]::new);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
