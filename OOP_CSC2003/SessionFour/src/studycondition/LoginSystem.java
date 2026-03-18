package studycondition;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String savedId = "admin";
        String savedPw = "1234";

        System.out.println("ID 입력: ");
        String Id = sc.next();
        System.out.println("비밀번호 입력: ");
        String Pw = sc.next();

        if (Id.equals(savedId) && Pw.equals(savedPw)) {
            System.out.println("로그인 성공");
        } else if (!Id.equals(savedId) && Pw.equals(savedPw)) {
            System.out.println("아이디가 틀렸습니다.");
        } else if (Id.equals(savedId) && !Pw.equals(savedPw)) {
            System.out.println("비밀번호가 틀렸습니다.");
        } else {
            System.out.println("아이디와 비밀번호 모두 틀렸습니다.");
        }
    }
}
