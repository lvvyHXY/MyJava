package Practice;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Test3Howmanyday {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2005,10,10,12,30);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.YEARS.between(birthday,now));
        System.out.println(ChronoUnit.MONTHS.between(birthday,now));
        System.out.println(ChronoUnit.DAYS.between(birthday,now));
    }
}
