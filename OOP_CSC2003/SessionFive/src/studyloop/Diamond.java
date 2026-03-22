package studyloop;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("홀수 높이 입력: ");
        int height = sc.nextInt();

        int side = (height - 1) / 2;
        int total = 1 + 2 * side;

        for (int i = 0; i < side+1; i++) { // 층
            for (int j = 1; j <= side-i; j++)
                System.out.print(" ");
            for (int k = 1; k <= (1 + 2 * i); k++)
                System.out.print("*");
            for (int h = 1; h <= side; h++)
                System.out.print(" ");
            System.out.println();
        }

        for (int i = side-1; i >= 0; i--) { // 층
            for (int j = 1; j <= side-i; j++)
                System.out.print(" ");
            for (int k = 1; k <= (1 + 2 * i); k++)
                System.out.print("*");
            for (int h = 1; h <= side; h++)
                System.out.print(" ");
            System.out.println();
        }


    }
}