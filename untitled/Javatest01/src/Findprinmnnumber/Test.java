package Findprinmnnumber;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Please input the num1 and number2:");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for(int i = start;i<=end;i++)
        {
            if(isPrime(i))
            {
                count++;
                if (i == end)
                    System.out.println(i);
                else
                System.out.println(i + " ");
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int num)
    {
        for(int i = 2;i<= Math.sqrt(num);i++)
        {
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
