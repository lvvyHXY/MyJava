package P65;

import java.util.Scanner;

public class Test1 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double h = (b - a)/n;
                double S = Function(b) + Function(a);
                System.out.println(S);
                double x = a;
                for (int k = 1; k < n; k++) {
                    x += h/2;
                    S = S + 4 * Function(x);
                    System.out.println(S);
                    x+= h/2;
                    S = S + 2 * Function(x);
                    System.out.println(S);
                }
                S += Function(b - h/2) * 4;
                S =S * h/6;
                System.out.println("答案是" + S);
            }
            public static double Function(double x){
                double ret = 3*x*x+2*x+1;  // 多项式函数
                return ret;
            }

        }
