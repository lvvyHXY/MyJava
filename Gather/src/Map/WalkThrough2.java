package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class WalkThrough2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("脉动","5元");
        map.put("雪碧","2元");
        map.put("芬达","3元");
        //利用键值对遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("-----------------------------------");
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> next = it.next();
            System.out.println(next.getKey() + "=" + next.getValue());
        }
        System.out.println("-----------------------------------");
        entries.forEach(stringStringEntry -> System.out.println(stringStringEntry.getKey() + "=" + stringStringEntry.getValue()));
    }
}
