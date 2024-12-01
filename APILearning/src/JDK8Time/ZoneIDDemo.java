package JDK8Time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIDDemo {
    public static void main(String[] args) {
        //所有时区
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);
        System.out.println(availableZoneIds.size());
        //系统默认时区
        ZoneId systemedID = ZoneId.systemDefault();
        System.out.println(systemedID);
        //获取指定时区
        ZoneId appointedZone = ZoneId.of("America/Cuiaba");
        System.out.println(appointedZone);
    }
}
