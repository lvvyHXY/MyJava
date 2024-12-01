package pBug;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*获取姓氏: https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
获取男生名字: http://www.haoming8.cn/baobao/10881.html
获取女生名字: http://www.haoming8.cn/baobao/7641.html
*/
        //1.创建要爬取的网站，用字符串存储
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "https://www.haoming8.cn/baobao/7641.html";
        //2.爬取数据并用StringBuilder拼接
        String oralFamilyName = webCrawl(familyNameNet);
        String oralBoyName = webCrawl(boyNameNet);
        String oralGirlName = webCrawl(girlNameNet);
        //3.用正则表达式筛选数据
        ArrayList<String> familyNameTemp = getData(oralFamilyName,"(\\W{4})(，|。)",1);//要用\\W，用.全是标签
        ArrayList<String> boyNameTemp = getData(oralBoyName,"([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> girlNameTemp = getData(oralGirlName,"(.. ){4}..",0);
        //处理数据
        //姓：把汉字截取出来
        ArrayList<String> familyName = new ArrayList<>();
        for (String s : familyNameTemp) {
            for (int i = 0;i<s.length();i++){
                familyName.add(s.charAt(i) + "");//加一个  "" 把他变成字符串，因为我是字符串类型的集合
            }
        }

        //男生名字：去重
        ArrayList<String> boyName = new ArrayList<>();
        boyNameTemp.stream().distinct().forEach(s -> boyName.add(s));

        //女生名字:分割出来，以空格分隔
        ArrayList<String> girlName = new ArrayList<>();
        for (String s : girlNameTemp) {
            String[] split = s.split(" ");
            for (int i = 0; i < split.length; i++) {
                girlName.add(split[i]);
            }
        }

        //生成
        ArrayList<String> name = getName(familyName, boyName, girlName, 70, 50);
        Collections.shuffle(name);
        //写入
        BufferedWriter bw = new BufferedWriter(new FileWriter("name.txt"));
        int b;
        for (String s : name) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
    //生成男女姓名
    public static ArrayList<String> getName(ArrayList<String> familyName,ArrayList<String> boyName,ArrayList<String> girlName,int boyCount,int girlCount){
        //生成男生姓名
        //为了不重复用set集合
        HashSet<String> hsBoy = new HashSet<>();
        while (true){
            if(hsBoy.size() == boyCount)
                break;
            //用打乱方法来随机
            Collections.shuffle(familyName);
            Collections.shuffle(boyName);
            hsBoy.add(familyName.get(0) + boyName.get(0));
        }

        //女生同理
        HashSet<String> hsGirl = new HashSet<>();
        while (true){
            if(hsGirl.size() == girlCount)
                break;
            //用打乱方法来随机
            Collections.shuffle(familyName);
            Collections.shuffle(girlName);
            hsGirl.add(familyName.get(0) + girlName.get(0));
        }

        //还要生成年龄
        ArrayList<String> nameList = new ArrayList<>();
        Random r = new Random();
        for (String s : hsBoy) {
            //18 - 29
            int age = r.nextInt(10) + 18;
            nameList.add(s + "-男-" +age);
        }
        //女生年龄
        for (String s : hsGirl) {
            //15 - 25
            int age = r.nextInt(10) + 15;
            nameList.add(s + "-女-" +age);
        }
        return nameList;
    }
    //第一个参数，爬取到的数据
    //第二个参数，正则表达式
    //第三个参数，取爬取到的第几组
    public static ArrayList<String> getData(String oral,String regex,int index){
        ArrayList<String> list = new ArrayList<>();
        //创建正则表达式对象
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(oral);
        while(matcher.find()){
            list.add(matcher.group(index));
        }
        return list;
    }
    public static String webCrawl(String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);//创建网站对象
        //保证网站是畅通的
        URLConnection connection = url.openConnection();
        //使用IO爬取数据
        //因为有中文，所以用转换流把字节流转换为字符流,connection.getInputStream()获取字节流
        InputStreamReader isr = new InputStreamReader(connection.getInputStream());
        int ch;
        while((ch = isr.read()) != -1){
            sb.append((char)ch);
        }
        //System.out.println(sb);
        isr.close();
        return sb.toString();
    }
}
