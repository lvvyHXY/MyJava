package HealthCaculator;

import java.util.Scanner;

public class ALLTest {
    //目标：写一个健康计算器
    //1.先让用户自己输入个人信xi
    //2.计算BMI
    public static void main(String[] args) {
        System.out.println("请输入身高体重");
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        System.out.println("请输入性别");
        String sex = sc.next();
        System.out.println("ages");
        int age = sc.nextInt();

        double BMI = calcBMI(height,weight);
        System.out.println("Your BMI =" + BMI);
    }
    public static double calcBMI(double height,double weight)
    {
        return weight/(height*height);
    }

}
