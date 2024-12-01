package StreamHuoQu;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //数组可以调用工具类Arrays里的方法获取stream流
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }
}
