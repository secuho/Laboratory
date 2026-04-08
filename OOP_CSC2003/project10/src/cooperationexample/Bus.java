package cooperationexample;

public class Bus {
    private int number;
    private int money;
    private int count;

    public Bus(int num) {
        this.number = num;
        this.money = 0;
        this.count = 0;
    }

    public void take(int money) {
        this.money += money;
        count++;
    }

    public void showInfo() {
        System.out.println("버스 번호: " + number + ", 요금: " + money + ", 승객 수: " + count);
    }
}
