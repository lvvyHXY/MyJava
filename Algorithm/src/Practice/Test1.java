package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    //键盘录入0-100整数直到所有整数和大于等于200
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = Integer.parseInt(sc.nextLine());
            if(num <1 || num > 100)
            {
                System.out.println("输入有误，请重新输入");
                continue;
            }
            arr.add(num);//这里触发了自动装箱，num会被自动转化成Integer装入集合中
            if(getSum(arr) >= 200)
            {
                System.out.println("输入结束");
                break;
            }
        }
    }
    public static int getSum(ArrayList<Integer> arr){
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum+=arr.get(i);
        }
        return sum;
    }
}
