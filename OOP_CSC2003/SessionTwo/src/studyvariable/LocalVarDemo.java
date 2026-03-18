package studyvariable;

public class LocalVarDemo {
    public static void main(String[] args) {
        int sum;
        int condition = (int)(Math.random() * 10);

        if (condition % 2 == 0) {
            sum = condition * 2;
        } else {
            sum = condition * 3;
        }

        System.out.println("sum = " + sum);

    }
}
