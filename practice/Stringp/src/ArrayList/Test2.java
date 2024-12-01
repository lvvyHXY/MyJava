package ArrayList;

import java.util.ArrayList;

public class Test2 {
    //添加整数
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (Integer integer : list) {
            System.out.print(integer);
        }
    }
}
