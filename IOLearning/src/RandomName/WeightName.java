package RandomName;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Double.*;

public class WeightName {
    public static void main(String[] args) throws IOException {
        //读取数据装入集合
        BufferedReader br = new BufferedReader(new FileReader("name1.txt"));
        ArrayList<Student> list = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null){
            String[] split = line.split("-");
            list.add(new Student(split[0],split[1], Integer.parseInt(split[2]), Double.parseDouble(split[3])));
        }
        //计算总权重
        double weightSum = 0;
        for (Student student : list) {
            weightSum+=student.getWeight();
        }
        //每一个人的权重
        double[] proportionArr = new double[list.size()];
        int index=0;
        for (Student student : list) {
            proportionArr[index] = student.getWeight() / weightSum;
            index++;
        }
        //每个人权重的占比范围
        for (int i = 1; i < proportionArr.length; i++) {
            proportionArr[i] = proportionArr[i] + proportionArr[i-1];
        }
        //生成随机数0.0-1.0
        double r = Math.random();
        //查找该数位置,该函数返回值是应该添加的位置的相反数减一  return = -index-1
        int indexPut = - Arrays.binarySearch(proportionArr, r) - 1;
        System.out.println(list.get(indexPut).getName());
        //调整权重,被抽到的减半，其余的填充
        double v = list.get(indexPut).getWeight() / 2;
        list.get(indexPut).setWeight(v);
        for (int i = 0; i < list.size(); i++) {
            if(i==indexPut){
                continue;
            }else {
                Student stu = list.get(i);
                stu.setWeight(stu.getWeight()+v/(list.size()-1));
            }
        }
        System.out.println(list);
        //重新写入文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("name1.txt"));
        for (Student student : list) {
            bw.write(student.getName()+"-"+student.getGender()+"-"+student.getAge()+"-"+student.getWeight());
            bw.newLine();
        }
        //close
        bw.close();
        br.close();
    }
}
