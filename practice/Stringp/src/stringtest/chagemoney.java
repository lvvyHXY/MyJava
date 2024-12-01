package stringtest;

import java.util.Scanner;

public class chagemoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while(true){
            System.out.println("请录入一个金额");
            money = sc.nextInt();
            if(money >= 0 && money <= 99999999){
                break;
            }
            else{
                System.out.println("无效");
            }
        }
        //表示结果的字符串
        String moneyStr = "";
        while(true){
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            //但是拼的是反的
            // moneyStr += capitalNumber;
            //这就是反着拼接
            moneyStr = capitalNumber + moneyStr;
            money = money/10;

            if(money == 0)
                break;
        }
        //前面补0，补齐7位数
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
           moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);
        //插入单位
        String[] arr = {"佰","拾","万","千","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            System.out.print(moneyStr.charAt(i));
            System.out.print(arr[i]);
        }
    }
    public static String getCapitalNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
}
