package MathDemo;

import java.util.Scanner;

public class zhishupanduan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n))
            System.out.println("是素数");
        else
            System.out.println("不是素数");
    }
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
