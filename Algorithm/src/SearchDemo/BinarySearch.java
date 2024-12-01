package SearchDemo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,7,12,79,81,103,127,131,147};
        int num = 7;
        System.out.println(binarySearch(num,arr));
    }
    public static int binarySearch(int num,int[] arr){
        int min = 0;
        int max = arr.length-1;
        while(true){
            if(min > max)
                return -1;
            int mid = (max-min) / 2 + min;
            if(num < arr[mid]){
                max = mid-1;
            } else if (num > arr[mid]) {
                min = mid+1;
            }else {
                return mid;
            }
        }
    }
}
