package studyvariable;

public class ScopeDemo {

    public static void main(String[] args) {

        int x = 10;
        if (x > 5) {
            int y = x * 2;
            System.out.println("y = " + y);
        }

        {
            int z = x + 5;
            System.out.println("z = " + z);
        }

        {
            int z = x - 5;
            System.out.println("z = " + z);
        }

    }
}
