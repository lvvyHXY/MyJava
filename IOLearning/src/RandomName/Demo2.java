package RandomName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //随机点名器，男女比7：3
        BufferedReader br = new BufferedReader(new FileReader("name.txt"));
        ArrayList<String> nameList = new ArrayList<>();
        String name;
        while((name = br.readLine()) != null){
            nameList.add(name);
        }
        Collections.shuffle(nameList);
        int[] proportion = {1,2,3,4,5,6,7,8,9,10};
        Random r = new Random();
        int boyCount = 0;
        int girlCount = 0;
        for (int i=0;i<100000;i++) {
            int sex = r.nextInt(10)+1;

            if(sex<=7){
                List<String> boy = nameList.stream().filter(s -> s.split("-")[1].equals("男")).collect(Collectors.toList());
                Collections.shuffle(boy);
                System.out.println(boy.get(0).split("-")[0]);
                boyCount++;
            }else {
                List<String> girl = nameList.stream().filter(s -> s.split("-")[1].equals("女")).collect(Collectors.toList());
                Collections.shuffle(girl);
                System.out.println(girl.get(0).split("-")[0]);
                girlCount++;
            }
        }
        System.out.println("男生有："+boyCount+"女生有："+ girlCount);
        br.close();
    }
}
