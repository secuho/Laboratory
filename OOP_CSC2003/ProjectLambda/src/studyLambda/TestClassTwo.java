package studyLambda;

public class TestClassTwo {

    public static void operate(Calculator c, int x, int y) {
        int result = c.calc(x, y);
        System.out.println("Result of addition: " + result);
    }

    public static Calculator getSubtractor() {
        return (x, y) -> x - y;
    }

    public static void main(String[] args) {

        operate((x, y) -> x + y, 10, 20);

        Calculator subtractor = getSubtractor();
        System.out.println("Subtraction result: " + subtractor.calc(20, 5));

    }
}
