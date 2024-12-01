package stringharderpractice;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(daLuan(str));
    }
    public static String daLuan(String str){
        char[] arr = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String ans = new String(arr);
        return ans;
    }
}
