package studycondition;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수: ");
        int a = sc.nextInt();
        System.out.println("두 번째 수: ");
        int b = sc.nextInt();
        System.out.println("세 번째 수: ");
        int c = sc.nextInt();

        int max = (a >= b) ? a : b;
        max = (c > max) ? c : max;

        System.out.println("최댓값은 " + max + "입니다.");

        return;
    }
}
