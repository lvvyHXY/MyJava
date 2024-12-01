package SearchDemo;

import java.util.ArrayList;

public class Test {
    //查找数组中元素是否存在，返回索引，考虑元素重复

    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79,81};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 81)
                list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
