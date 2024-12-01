package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> listB = new ArrayList<>();
        Collections.addAll(listB,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        ArrayList<String> listG = new ArrayList<>();
        Collections.addAll(listG,"杜琦燕","袁明媛","李猜","田蜜蜜");
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(arr);
        Random r = new Random();
        int number = arr.get(0);
        if(number==1){
            System.out.println(number);
            System.out.println(listB.get(r.nextInt(listB.size())));
        }
        else{
            System.out.println(number);
            System.out.println(listG.get(r.nextInt(listG.size())));
        }
    }
}
