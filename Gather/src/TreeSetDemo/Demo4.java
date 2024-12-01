package TreeSetDemo;

import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        Students s1 = new Students("zhangsan",23,80,90,70);
        Students s2 = new Students("lisi",24,70,80,90);
        Students s3 = new Students("wangwu",25,70,100,70);
        Students s4 = new Students("zhaoliu",26,90,80,90);
        Students s5 = new Students("qianqi",26,90,80,90);
        TreeSet<Students> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Students t : ts) {
            System.out.print(t + " ");
            int sum = t.getChinese() + t.getEnglish() + t.getMath();
            System.out.println( "总分为："+ sum);
        }

    }
}
