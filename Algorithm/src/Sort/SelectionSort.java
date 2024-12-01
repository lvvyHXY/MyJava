package Sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionSort(int[] arr){
        //把每一个数都和后面所有的数比较一次，如果比该数大则交换位置
        //外循环从0开始
        for (int i = 0; i < arr.length; i++) {
            //内循环从i+1开始
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
