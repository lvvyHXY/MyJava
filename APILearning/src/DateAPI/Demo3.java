package DateAPI;

import java.util.Date;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d2);
        if(d1.getTime() > d2.getTime()){
            System.out.println("d1 > d2");
        }else if(d1.getTime() < d2.getTime()){
            System.out.println("d1 < d2");
        }else{
            System.out.println("d1 == d2");
        }
    }
}
