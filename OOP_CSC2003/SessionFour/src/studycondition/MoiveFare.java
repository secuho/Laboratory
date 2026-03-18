package studycondition;

import java.util.Scanner;

public class MoiveFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이 입력: ");
        int age = sc.nextInt();

        int fare = switch (age / 20) {
            case 0 -> (age <= 12) ? 5000 : 7000;
            default -> (age <= 64) ? 10000 : 4000;
        };

        System.out.println("비용: " + fare);
    }
}
