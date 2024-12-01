package stringtest;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String ret = "";
        for (int r = str.length()-1; r >= 0; r--) {
            ret += str.charAt(r);
        }
        return ret;
    }
}
