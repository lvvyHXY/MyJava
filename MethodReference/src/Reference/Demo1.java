package Reference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo1 {
    //条件：1.要引用的地方是一个函数式接口
    //2.被引用的函数必须存在
    //3.被引用方法的形参和返回值必须与抽象方法一致
    //3.被引用方法的功能必须和被取代地方一致
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,4,7,6,2,0,8};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        Integer[] arr1 = {1,3,5,9,4,7,6,2,0,8};
        //sort 方法还可以还可以自定义排序方式，而此处就是函数式接口Comparator
        //Arrays要改成对应的引用类型才能重写比较规则
        /*Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });*/
       //Arrays.sort(arr1,(o1,o2) -> o2-o1);
        //  "::"引用符号
        Arrays.sort(arr1,Demo1::method);
       for (int i = 0; i < arr1.length; i++) {
           System.out.print(arr1[i]);
       }
    }
    public static int method(Integer o1,Integer o2){
        return o2-o1;
    }
}
