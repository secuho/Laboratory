package encapsulationexample;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Kim", 50000);

        acc.deposit(20000);
        acc.withdraw(100000);
        acc.withdraw(30000);
        System.out.println("현재 잔액: " + acc.getBalance() + "원");
    }
}
