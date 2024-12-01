package stringharderpractice;

public class Test5extended {
    public static void main(String[] args) {
        //统计接下来这句话中Java的个数
        System.out.println("JavaJavaJava语言是安全的，Java是高性能的，Java语言是跨平台的");
        String str = "JavaJavaJava语言是安全的，Java是高性能的，Java语言是跨平台的";
        int ans = countNumberOfJava(str);
        System.out.println(ans);
    }
    public static int countNumberOfJava(String str){
        int count = 0;
        int index = -1;
        while(true){
            index = str.indexOf("Java");
            if(index == -1)
                break;
            else
            {
                count++;
                str = str.substring(index+4);
            }
        }
        return count;
    }
}
