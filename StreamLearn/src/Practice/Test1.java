package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(integer -> integer%2==0).forEach(i -> System.out.println(i));
    }
}
