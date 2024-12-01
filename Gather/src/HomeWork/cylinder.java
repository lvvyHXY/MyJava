package HomeWork;

public class cylinder extends circle{
    private double height;
    public cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public cylinder(){}

    public cylinder(double height) {
        this.height = height;
    }


    public double volume(){
        return 2*Math.PI*this.getRadius()*height;
    }
    public void show(){
        System.out.println("圆柱体的体积为"+volume());
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
        return "cylinder{height = " + height + "}";
    }
}
