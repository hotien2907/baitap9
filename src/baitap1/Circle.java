package baitap1;

public class Circle implements  Resizeable{
    @Override
    public void resize(double percent) {
        this.radius = (1 + percent / 100)* this.radius;
    }
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
