package studyvariable;

public class TypeCastingDemo {
    public static void main(String[] args) {
        int n = 7;
        double d = 2.5;

        double result1 = n / d;
        int result2 = (int)(n / d);
        int result3 = n / (int)d;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
