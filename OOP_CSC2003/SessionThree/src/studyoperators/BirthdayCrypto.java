package studyoperators;

import java.util.Scanner;

public class BirthdayCrypto {

    public static int encrypt(int id) {
        return (((id << 2) ^ 0x5A5A) ^ 0x1000);
    }

    public static int decrypt(int enc) {
        return ((enc ^ 0x1000) ^ 0x5A5A) >>> 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthday: ");
        int id = sc.nextInt();

        int enc = encrypt(id);
        int dec = decrypt(enc);

        System.out.println("Encrypted value: " + enc);
        System.out.println("Decrypted value: " + dec);

        return;
    }
}
