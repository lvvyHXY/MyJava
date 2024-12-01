package ArrayList;

import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
