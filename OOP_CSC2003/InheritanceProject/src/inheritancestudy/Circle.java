package inheritancestudy;

public class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double area() {
        return 3.14*radius*radius;
    }

    public double perimeter() {
        return 2*3.14*radius;
    }
}
