package SimpleDateFormateAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        String startTime = "2023年11月11日 00:00:00";
        String endTime = "2023年11月11日 00:10:00";
        String testTime = "2023年11月11日 00:11:00";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start = sdf1.parse(startTime);
        Date end = sdf1.parse(endTime);
        Date test = sdf1.parse(testTime);
        long st = start.getTime();
        long et = end.getTime();
        long tt = test.getTime();
        if(tt >= st && tt <= et)
        {
            System.out.println("在范围内");
        }else {
            System.out.println("不在范围内");
        }
    }
}
