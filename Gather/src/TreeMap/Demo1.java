package TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        TreeMap<Integer,String> tm = new TreeMap<>((o1,o2) -> o2 - o1);
        tm.put(1,"康师傅");
        tm.put(2,"雪碧");
        tm.put(3,"脉动");
        tm.put(4,"蛋白粉");
        tm.put(5,"芬达");
        //Integer默认升序排列，要降序则用比较器
        System.out.println(tm);

    }
}
