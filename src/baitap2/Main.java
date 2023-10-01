package baitap2;

public class Main {
    public static void main(String[] args) {
        Colorable[] colorables = new Colorable[3];
        colorables[0] = new Square(5);
        colorables[0].howToColor();
        colorables[1] = new Square(10);
        colorables[1].howToColor();
        colorables[2] = new Square(15);
        colorables[2].howToColor();

        System.out.println("Diện tích: " + colorables[0].getArea());
        System.out.println("Diện tích: " + colorables[1].getArea());
        System.out.println("Diện tích: " + colorables[2].getArea());

    }
}
