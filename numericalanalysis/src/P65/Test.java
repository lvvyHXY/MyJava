package P65;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = (b - a) / n;
        double S = Function(a) + Function(b);

        for (int k = 1; k < n; k++) {
            double x = a + k * h;
            if (k % 2 == 0) {
                S = S + 2 * Function(x);
            } else {
                S = S + 4 * Function(x);
            }
        }

        S = (h / 3) * S;
        System.out.println("答案是 " + S);
    }

    public static double Function(double x) {
        double ret = 3 * x * x + 2 * x + 1;  // 多项式函数
        return ret;
    }
}
