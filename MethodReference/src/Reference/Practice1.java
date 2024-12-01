package Reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Practice1 {
    public static void main(String[] args) {
        /*
需求：
集合中存储一些字符串的数据，比如：张三,23。
收集到 Student 类型的数组当中
*/

// 1. 创建集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张丰,100", "张翠山,40", "张良,35", "王二麻子,37");
        Student[] arr = list.stream().map(s -> new Student(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).toArray(Student[]::new);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
