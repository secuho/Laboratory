package studyoperators;

public class QuizFour {
    public static void main(String[] args) {

        int x = 12345;

        System.out.printf("하위 8비트 = %X%n", (x & 0xFF));
        System.out.printf("상위 비트  = %X%n", (x >> 8));

        return;
    }
}
