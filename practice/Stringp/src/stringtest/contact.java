package stringtest;

public class contact {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = changeItToString(arr);
        System.out.println(s);
    }
    public static String changeItToString(int[] arr){
        String str="[";
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1)
                str += arr[i];
            else
            str += arr[i] + ",";
        }
        str += "]";
        return str;
    }
}
