package inheritancestudy;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("rectangle", 4, 5);
        Shape s2 = new Circle("circle", 3);
        s1.showInfo();
        s2.showInfo();
    }
}