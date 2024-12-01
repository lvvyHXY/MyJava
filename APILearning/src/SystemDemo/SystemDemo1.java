package SystemDemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        //获取从起始时间到现在过了多少毫秒 1970.1.1 00:00:00 ，中国起始时间加八小时
        long time = System.currentTimeMillis();
        System.out.print("当前时间是：" + time);
        System.out.print("当前时间是：" + time);
        System.out.println();
        //拷贝数组
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = new int[10];
        //数据源数组，从数据源的第几个开始拷贝，目标数组，目标数组开始的位置，拷贝几个
        System.arraycopy(arr,0,arr2,0,10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.exit(0);
        System.out.println("执行了吗");
    }
}
