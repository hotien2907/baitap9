package baitap4;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("diện tích HT là:" + 2*Math.PI* this.radius* this.radius);

    }
}
