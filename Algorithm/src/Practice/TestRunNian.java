package Practice;

import java.time.LocalDate;

public class TestRunNian {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2024,3,1);
        LocalDate FebLastDay = d.minusDays(1);
        if (FebLastDay.getDayOfMonth() == 29)
            System.out.println("闰年");
        else
            System.out.println("非闰年");
        System.out.println(d.isLeapYear());
        System.out.println(FebLastDay);
    }
}
