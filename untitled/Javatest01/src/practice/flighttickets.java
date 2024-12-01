package practice;

import java.util.Objects;
import java.util.Scanner;

public class flighttickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double priceBefore = sc.nextDouble();
        int month = sc.nextInt();
        String seat = sc.next();
        System.out.println(FinalPrice(priceBefore,month,seat));
    }
    public static double FinalPrice(double priceBefore,int month,String seat)
    {
        double ret = 0;
        switch(month)
        {
            case 5,6,7,8,9,10->{
                if(Objects.equals(seat, "头等舱"))
                {
                    ret = 0.9*priceBefore;
                }
                else
                    ret = 0.85*priceBefore;
            }
            case 1,2,3,4,11,12->{
                if(Objects.equals(seat, "头等舱"))
                {
                    ret = 0.7*priceBefore;
                }
                else
                    ret = 0.65*priceBefore;
            }
        }
        return ret;
    }
}
