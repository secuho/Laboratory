package studycondition;

import java.util.Scanner;

public class BmiPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("체중(kg): ");
        double weight = sc.nextDouble();
        System.out.print("키(cm): ");
        double height = sc.nextDouble();

        double bmi = weight / Math.pow(height / 100, 2);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상");
        } else if (bmi < 25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
    }
}
