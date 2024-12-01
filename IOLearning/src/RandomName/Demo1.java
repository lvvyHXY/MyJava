package RandomName;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("name.txt"));
        ArrayList<String> nameList = new ArrayList<>();
        String name;
        while((name = br.readLine()) != null){
            nameList.add(name);
        }
        Collections.shuffle(nameList);
        System.out.println(nameList.get(0).split("-")[0]);
        br.close();
    }
}
