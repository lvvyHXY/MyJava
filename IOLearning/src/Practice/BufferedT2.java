package Practice;

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class BufferedT2 {
    public static void main(String[] args) throws IOException {
        //将出师表回复顺序
        //每一行前有序号，所以可以用readLine读取，用split读出前面的点前面的序号
        //1.读取数据
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        HashMap<Integer,String> hm = new HashMap<>();
        String line;
        while((line = br.readLine()) != null){
            String[] splits = line.split("\\.");
            hm.put(Integer.parseInt(splits[0]),line);
        }
        //排序
        String[] array = hm.entrySet().stream().sorted((o1,o2) ->o1.getKey() - o2.getKey()).
                map(integerStringEntry -> integerStringEntry.getValue()).
                toArray(String[]::new);
        //写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("a1.txt"));
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i]);
            bw.newLine();
        }
        bw.close();
        br.close();
        //其实本题直接用ArrayList<String>也可以，用Collections.sort()自定义排序规则排序
    }
}
