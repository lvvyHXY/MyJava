package Sort;

import java.util.Arrays;

public class InsertSort {
    //就像是插入扑克牌那样
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertSort(int[] arr)
    {
        int startIndex = -1;
        //1.找到哪一个开始无序
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1]){
                startIndex = i + 1;//后一个才是开始
                break;
            }
        }
        //2.开始插入排序
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;//记录索引，因为可能之后会多次调整这个索引
            while(j > 0 && arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
            }
        }

    }
}
