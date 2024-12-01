package HomeWork;

public class rectangle implements Shape{
    private double width;
    private double length;

    public rectangle() {
    }

    public rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double girth() {
        return 2*(width+length);
    }

    public void show(){
        System.out.println("面积是："+area()+"周长是："+girth());
    }

    /**
     * 获取
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 获取
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * 设置
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "rectangle{width = " + width + ", length = " + length + "}";
    }
}
