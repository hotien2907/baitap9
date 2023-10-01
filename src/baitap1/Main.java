package baitap1;

public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Square square = new Square(3);

        Resizeable[] shapes = {circle, rectangle, square};

        for (Resizeable shape : shapes) {
            double resizePercent = Math.random() * 100 + 1;

//            System.out.println(resizePercent);
            System.out.println("diện tích trước khi thay đổi kích thước\n: " + shape.getArea());
//            shape.resize(resizePercent);
            System.out.println("diện tích sau khi thay đổi kích thước bằng:  " + resizePercent + "%: " + shape.getArea());
            System.out.println("--------------------");
        }
    }
}
