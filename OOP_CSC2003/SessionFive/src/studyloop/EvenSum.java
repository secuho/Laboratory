package studyloop;

public class EvenSum {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;

        while (num <= 100) {
            if (num % 2 == 0)
                sum += num;
            num++;
        }

        System.out.println("1부터 100까지 짝수의 합 = " + sum);

    }
}
