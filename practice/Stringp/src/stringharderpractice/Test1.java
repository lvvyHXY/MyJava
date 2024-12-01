package stringharderpractice;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String str;
        while (true) {
            Scanner sc = new Scanner(System.in);
            str = sc.next();
            //System.out.println(checkStr(str));
            if(checkStr(str)){
                break;
            }else{
                System.out.println("重新输入");
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - '0';
            sb.append(changeIntoRoma(number));
        }
        System.out.println(sb);
    }
    //校验
    public static boolean checkStr(String str){
        if(str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
    //转化为罗马数字
    public static String changeIntoRoma(int number){
        //定义一个数组，让索引和数字产生对应
        String[] arr = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        return arr[number];
    }
}
