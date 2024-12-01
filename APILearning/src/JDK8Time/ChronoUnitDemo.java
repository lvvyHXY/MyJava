package JDK8Time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        LocalDateTime birthday = LocalDateTime.of(2019, 1, 1, 0, 0, 0);
        System.out.println(birthday);
        System.out.println("相距的天数" + ChronoUnit.DAYS.between(birthday,today));
        System.out.println("相距离的年数" + ChronoUnit.YEARS.between(birthday,today));
    }
}
