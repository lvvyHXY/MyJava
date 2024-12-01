package TreeSetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo3 {
    /* "c" "ab"  "ef"  "qwer" 先按长度排序，长度相同按首字母排序（默认排序)   */
    public static void main(String[] args) {
        String s1 = "c";
        String s2 = "ef";
        String s3 = "ab";
        String s4 = "qwer";
        //比较器排序，创建集合时传入比较器
        TreeSet<String> ts = new TreeSet<>((o1,o2) -> {
                int i = o1.length() - o2.length();
                 i = i == 0? o1.compareTo(o2) : i;
                return i;
        });
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);
    }
}
