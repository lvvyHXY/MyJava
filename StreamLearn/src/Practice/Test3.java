package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("周润发,40");
        manList.add("成龙,50");
        manList.add("刘德华,50");
        manList.add("吴京,43");
        manList.add("周星驰,71");
        manList.add("李连杰,57");

        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("林心如,37");
        womanList.add("张曼玉,60");
        womanList.add("林青霞,68");
        womanList.add("柳岩,38");
        womanList.add("林志玲,47");
        womanList.add("杨,20");
        womanList.add("王祖贤,18");
        womanList.add("杨幂,37");

        //需求：男演员只要名字为三个字的前两人
        Stream<String> man = manList.stream().filter(s -> s.split(",")[0].length() ==3).limit(2);
        //man.forEach(s -> System.out.println(s));
        System.out.println("-------------------------------------------------------------------");
        //女演员只要杨开头的，并且不要第一个
        Stream<String> women = womanList.stream().filter(s -> s.startsWith("杨")).skip(1);
        //women.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------------------------------------------");
        //把过滤后的男女演员装到一起
        //用到类型转换，map方法
        //前面的sout要注释掉，因为一个stream流只能调用一次stream的方法！！！！！
        List<Actor> list = Stream.concat(man, women).map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());
        //封装为Actor对象
        System.out.println(list);
        //所有演员对象保存到List集合中
       //System.out.println(list);
    }
}
