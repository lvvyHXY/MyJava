package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Students s1 = new Students("zhangsan",23);
        Students s2 = new Students("lisi",24);
        Students s3 = new Students("wangwu",25);
        Students s4 = new Students("wangwu",25);
        HashMap<Students,String> map = new HashMap<>();
        map.put(s1,"湖南");
        map.put(s2,"湖北");
        map.put(s3,"河南");
        map.put(s4,"山东");
        map.forEach((key,value) -> System.out.println(key + "=" + value));
        Set<Students> keys = map.keySet();
        for (Students key : keys) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        //
    }
}
