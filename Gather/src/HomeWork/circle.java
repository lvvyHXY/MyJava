package HomeWork;

public class circle implements Shape{
    private double radius;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double girth() {
        return 2*Math.PI*radius;
    }
    public void show(){
        System.out.println("周长为:" + girth() +","+"面积为:"+area());
    }

    /**
     * 获取
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 设置
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "circle{radius = " + radius + "}";
    }
}
