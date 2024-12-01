package EasyCalculator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Please in the first number");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("Please in the operator");
        String operator = sc.next();
        System.out.println("Please in the second number");
        double num2 = sc.nextDouble();
        double ret = calc(num1,operator,num2);
        System.out.println(ret);
    }
    public static double calc(double num1,String operator,double num2)
    {
        double ret = 0;
        switch (operator)
        {
            case "+":
                ret = num1 + num2;
                break;
            case "-":
                ret = num1 - num2;
                break;
            case "*":
                ret = num1 * num2;
                break;
            case "/":
                ret = num1 / num2;
                break;
        }
        return ret;
    }
}
