package inheritancestudy;

public class Rectangle extends Shape{
    protected double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width*height;
    }

    public double perimeter() {
        return 2*(width+height);
    }
}
