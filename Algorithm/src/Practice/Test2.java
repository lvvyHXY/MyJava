package Practice;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(toBinaryInteger(num));
    }
    public static String toBinaryInteger(int num){
        StringBuilder sb = new StringBuilder();
        while(true){
            if(num == 0) break;
            sb.insert(0,num%2);
            num = num/2;
        }
        return sb.toString();
    }
}
