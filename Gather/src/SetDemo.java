import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //add ,由于不重复特性，返回值是boolean，true表示添加成功，false表示添加失败就有用了
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        System.out.println(set.add("aaa"));
        System.out.println(set);
        //remove
        set.remove("aaa");
        System.out.println(set);
        //遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.print(str + " ");
        }
        System.out.println();
        for(String str : set){
            System.out.print(str + " ");
        }
        System.out.println();
        set.forEach(s -> System.out.print(s + " "));
    }
}
