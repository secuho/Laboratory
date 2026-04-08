package encapsulationexample;

public class BankAccount {
    private String ownerName;
    private int balance;

    public BankAccount(String name, int balance) {
        this.ownerName = name;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다. 잔액: " + balance);
        } else {
            System.out.println("잘못된 금액이 입금되었습니다.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + "원이 출금되었습니다. 잔액: " + balance);
            } else {
                System.out.println("잔액 부족");
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}
