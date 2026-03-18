package studyvariable;

public class SumWithConstant {
    public static void main(String[] args) {
        final int MAX = 5;
        int sum = 0;

        for (int i = 1; i<=MAX; i++) {
            sum += i;
        }

        System.out.println("1부터 " + MAX + "까지의 합: " + sum);

        return;
    }
}
