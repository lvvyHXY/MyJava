package TreeSetDemo;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(3);
        ts.add(7);
        ts.add(1);
        ts.add(9);
        //1.迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        //2.增强for
        for(Integer i : ts){
            System.out.println(i + " ");
        }
        //3.Lambda
        ts.forEach(integer-> System.out.println(integer + " "));
    }
}
