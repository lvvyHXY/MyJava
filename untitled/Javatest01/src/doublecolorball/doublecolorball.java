package doublecolorball;

import java.util.Random;
import java.util.Scanner;

public class doublecolorball {
    public static void main(String[] args) {
        int[] target = CreateNumber();
        int[] myBalls = CreateMyBall();
    }
    public static int[] CreateMyBall()
    {
        int[] myBall = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            int redNumber = sc.nextInt();
            if(redNumber>=1&&redNumber <= 33)
            {
                if(!IsContains(myBall,redNumber)) {
                    myBall[i] = sc.nextInt();
                    i++;
                }
                else
                {
                    System.out.println("红球重复，请重新输入");
                }
            }
            else
            {
                System.out.println("红球不在范围内");
            }
        }
        System.out.println("请输入蓝球");
        while (true) {
            int blueBall = sc.nextInt();
            if(blueBall>=1 && blueBall<=16)
            {
                myBall[6] = sc.nextInt();
                break;
            }
            else
                System.out.println("篮球不在范围内");
        }
        return myBall;
    }
    public static int[] CreateNumber()
    {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int r1 = r.nextInt(33) + 1;
            if(!IsContains(arr,r1))
            {
                arr[i] = r1;
                i++;
            }
        }
        arr[6] = r.nextInt(16) + 1;
        return arr;
    }
    public static boolean IsContains(int[] arr,int number)
    {
        for (int i = 0; i < arr.length; i++) {
         if(arr[i] == number)
             return true;
        }
        return false;
    }
}
