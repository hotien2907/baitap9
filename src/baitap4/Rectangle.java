package baitap4;

public class Rectangle  extends Shape{
    private double width;
    private  double height;

    public Rectangle() {
    }

    public Rectangle(double width) {
        this.width = width;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("diện tích HCN là :"+ this.width * this.height);
    }
}
