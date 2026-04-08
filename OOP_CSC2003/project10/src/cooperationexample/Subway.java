package cooperationexample;

public class Subway {
    private String line;
    private int money;
    private int count;

    public Subway(String lineNumber) {
        this.line = lineNumber;
        this.money = 0;
        this.count = 0;
    }

    public void take(int money) {
        this.money += money;
        this.count++;
    }

    public void showInfo() {
        System.out.println("호선 번호: " + line + ", 요금: " + money + ", 승객 수: " + count);
    }
}
