package RandomName;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("name.txt"));
        ArrayList<String> nameList = new ArrayList<>();
        String name;
        while((name = br.readLine()) != null){
            nameList.add(name);
        }
        Collections.shuffle(nameList);

        BufferedReader brc = new BufferedReader(new FileReader("count.txt"));
        int count = Integer.parseInt(brc.readLine());
        if(count == 2){
            System.out.println("张三");
        }else {
            System.out.println(nameList.get(0).split("-")[0]);
        }
        count++;
        BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
        bw.write(String.valueOf(count));
        bw.close();
        brc.close();
        br.close();
    }
}
