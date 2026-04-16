package inheritancestudy;

public class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area() {
        return 0.0;
    }

    public double perimeter() {
        return 0.0;
    }

    public void showInfo() {
        System.out.println(name + "의 넓이: " + area() + ", 둘레: " + perimeter());
    }
}
