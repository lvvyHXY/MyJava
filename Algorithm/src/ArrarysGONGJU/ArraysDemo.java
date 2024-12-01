package ArrarysGONGJU;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        //Arrays工具类
        //  Arrays.toString(arr)
        int[] arr = {6,1,5,4,2,3};
        String string = Arrays.toString(arr);
        System.out.println(string);
        System.out.println("--------------------------------------------");
        //Arrays.binarySearch(arr,num)
        //数组元素要升序
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.binarySearch(arr1,3));
        System.out.println("----------------------------------------------");
        //Arrays.copy(arr,length)
        int[] arr2 = Arrays.copyOf(arr1,3);
        System.out.println(Arrays.toString(arr2));
        System.out.println("----------------------------------------------");
        //Arrays.copyOfRange(arr,start,end)
        int[] arr3 = Arrays.copyOfRange(arr1,0,3);//包头不包尾，包左不包右
        System.out.println(Arrays.toString(arr3));
        System.out.println("----------------------------------------------");
        //Arrays.fill(arr,num)
        //全部改值
        int[] arr4 = {1,2,3,4,5,6,7,8};
        Arrays.fill(arr4,100);
        System.out.println(Arrays.toString(arr4));
        System.out.println("----------------------------------------------");
        // Arrays.sort(arr)
        //升序快速排序
        int [] arr5 = {6,5,1,4,2,3};
        Arrays.sort(arr5);
        System.out.println(Arrays.toString(arr5));
        System.out.println("----------------------------------------------");
        //Arrays.sort(arr,规则)
        // 细节：数组类型要改成对应的引用数据类型，也就是包装类
        Integer [] arr6 = {6,5,1,4,2,3};
        //默认0索引为有序序列，后面的为无序序列，用的是插入排序和二分查找
        //o1：无序序列的元素，o2：有序序列的元素
        //return的是正数或0，则插在后面，负数则插在前面
       /* Arrays.sort(arr6,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/
        //Lambda写法
        Arrays.sort(arr6,(o1,o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr6));
    }
}
