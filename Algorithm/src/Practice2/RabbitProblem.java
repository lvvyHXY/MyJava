package Practice2;

import java.util.Arrays;

public class RabbitProblem {
    public static void main(String[] args) {
        //其实就是一个斐波那契数列
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[11]);

        //用递归做
        System.out.println(rabbit(12));

    }
    public static int rabbit(int month){
        if(month==1 || month==2)
            return 1;
        else
            return rabbit(month-1)+rabbit(month-2);
    }
}
