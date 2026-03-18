package studycondition;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("연도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.println("월(1~12)를 입력하세요: ");
        int month = sc.nextInt();

        int days;
        days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                yield ((year%4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
            }
            default -> {
                yield -1;
            }
        };

        if (days > 0) {
            System.out.println(year + "년 " + month + "월은 " + days + "일 입니다.");
        }

    return;
    }
}
