package Practice2;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        GrilFriend g1 = new GrilFriend("xiaodan",18,168.0);
        GrilFriend g2 = new GrilFriend("xiaoxiao",19,170.0);
        GrilFriend g3 = new GrilFriend("yexi",19,169.0);
        GrilFriend g4 = new GrilFriend("abc",19,170.0);
        GrilFriend[] arr = {g1,g2,g3,g4};
        Arrays.sort(arr, (o1,o2) -> {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
                if(temp > 0) return 1;
                else if(temp < 0) return -1;
                else return 0;
            });
        System.out.println(Arrays.toString(arr));
    }
}
