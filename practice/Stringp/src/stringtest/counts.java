package stringtest;

import java.util.Scanner;

public class counts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int Capital = 0;
        int Lower = 0;
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c>='A' && c<='Z')
                Capital++;
            else if(c>='a' && c<='z')
                Lower++;
            else if(c>='0' && c<='9')
                number++;
        }
        System.out.println("大写字母有：" + Capital);
        System.out.println("小写字母有：" + Lower);
        System.out.println("数字有：" + number);
    }
}
