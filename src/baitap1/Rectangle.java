package baitap1;

public class Rectangle implements  Resizeable{
    @Override
    public void resize(double percent) {
        this.width *= (1 + percent / 100);
        this.height *= (1 + percent / 100);
    }
    private double width;
    private double height;

    public Rectangle() {
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


    public double getArea() {
        return width * height;
    }
}
