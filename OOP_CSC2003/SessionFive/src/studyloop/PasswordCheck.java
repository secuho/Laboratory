package studyloop;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        String correct = "java123";

        do {
            System.out.println("비밀번호를 입력하세요: ");
            password = sc.next();
            if (!password.equals(correct))
                System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
        } while(!password.equals(correct));

        System.out.println("로그인 성공!");
    }
}
