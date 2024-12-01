package jiami;

public class encode {
    public static void main(String[] args) {
        Encode();
    }
    public static void Encode()
    {
        int[] arr = {1,9,8,3};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]%10;
        }
        int leftIndex = 0;
        int rightIndex = arr.length-1;
        while(leftIndex < rightIndex)
        {
            int temp =0;
            temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
