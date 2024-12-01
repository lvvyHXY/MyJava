package anli;

public class SmartHomeControl {
    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();
    private SmartHomeControl(){
        System.out.println("智能家居控制中心已启动");
    }
    public static SmartHomeControl getInstance(){
        return smartHomeControl;
    }
    public void control(JD jd){
        System.out.println(jd.getName()+"状态目前是："+ (jd.isStatus() ? "开着":"关着"));
        System.out.println("按下开关");
        jd.press();
        System.out.println(jd.getName()+"状态已变为："+ (jd.isStatus() ? "开着":"关着"));
    }
    public void printAllStatus(JD[] jds){
        for (int i = 0; i < jds.length; i++) {
            System.out.println(i+1+"."+jds[i].getName()+"状态目前是："+ (jds[i].isStatus() ? "开着":"关着"));
        }
    }
}
