package HomeWork;

public class cuboid extends rectangle{
    private double height;

    public cuboid() {
    }

    public cuboid(double width, double length,double height) {
        super(width, length);
        this.height = height;
    }

    public double volume(){
        return area()*height;
    }

    public void show(){
        System.out.println("长方体的体积为："+volume());
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "cuboid{height = " + height + "}";
    }
}
