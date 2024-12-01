package test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //打乱数组中的数据
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +" ");
        }
        System.out.println();
        //装入二维数组里
        int [][] data = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            data[i/4][i%4] = arr[i];
        }
        for (int i = 0;i < 4;i++){
            for (int j = 0; j < 4; j++) {
                System.out.print(data[i][j]+" ");

            }
            System.out.println();
        }
    }
}
