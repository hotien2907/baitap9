package baitap1;

public class Square  implements  Resizeable{
    @Override
    public void resize(double percent) {
        this.side *= (1 + percent / 100);
    }
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getArea() {
        return side * side;
    }
}
