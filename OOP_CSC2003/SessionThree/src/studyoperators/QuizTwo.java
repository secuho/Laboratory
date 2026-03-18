package studyoperators;

import java.util.jar.JarOutputStream;

public class QuizTwo {
    public static void main(String[] args) {

        int a = 8;
        int b = 3;

        System.out.println(a += b * 2);
        System.out.println((a << 2) - b);
        System.out.println(a & b);

        return;
    }
}
