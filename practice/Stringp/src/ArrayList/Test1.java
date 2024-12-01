package ArrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i != list.size() - 1)
            System.out.print(list.get(i) + ",");
            else
                System.out.print(list.get(i));
        }
        System.out.print("]");
    }
}
