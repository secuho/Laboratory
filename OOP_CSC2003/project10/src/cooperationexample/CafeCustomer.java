package cooperationexample;

public class CafeCustomer {
    private String name;
    private int money;

    public CafeCustomer(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void charge(int amount) {
        this.money += amount;
    }

    public void pay(int amount) {
        this.money -= amount;
    }

    public int getMoney() {
        return money;
    }

    public void showInfo() {
        System.out.println(name + "님의 잔액: " + money + "원");
    }
}
