package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListBianli {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        //1.迭代器遍历
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }*/
        //2.for介
        /*for (String s : list) {
            System.out.print(s + " ");
        }*/
        //3.Lambda
        /*list.forEach(s -> System.out.print(s + " "));*/
        //4.按索引遍历
        /*for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }*/
        //5.列表迭代器
        //增加了 previous（）  hasPrevious（）来把指针归位置
        //迭代器里有了add方法
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            String s = it.next();
            if("bbb".equals(s))
                it.add("qqq");
            System.out.print(s + " ");
        }


    }

    }
