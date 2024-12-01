package P70;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double e = sc.nextDouble();//精确度要求
        double h = b - a;
        double T1 = h/2 * (Function(a)+Function(b));
        for (int k = 1; k <= 3; k++) {

        }
    }
    public static double Function(double x){
        double ret = x;
        return x;
    }
}
