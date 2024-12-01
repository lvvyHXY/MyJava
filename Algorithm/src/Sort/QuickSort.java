package Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void quickSort(int[] arr,int i,int j)
    {
        int start = i;
        int end = j;
        //递归出口
        if(start > end)
            return;

        int baseNum = arr[i];
        while(start != end){
            //end往前找小于基准书的数字
            //一定要先end，因为这样start == end的时候停在的位置是小于基准数的位置，如果先start则会停在比基准数大的数的位置
            while(true){
                if(end <= start || arr[end] < baseNum)
                {
                    break;
                }
                end--;
            }
            //start往后找大于基准数的数字
            while(true){
                if(end <= start || arr[start] > baseNum)
                {
                    break;
                }
                start++;
            }
            //交换start，end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //基准数归位
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //基准数左边的数
        quickSort(arr,i,start - 1);

        //基准数右边的
        quickSort(arr,start + 1,j);
    }
}
