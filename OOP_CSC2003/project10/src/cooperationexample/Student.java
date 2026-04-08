package cooperationexample;

public class Student {
    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        if (money >= 1200) {
            money -= 1200;
            bus.take(1200);
        } else {
            System.out.println("가지고 있는 현금이 부족합니다.");
            return;
        }
    }

    public void takeSubway(Subway subway) {
        if (money >= 1350) {
            money -= 1350;
            subway.take(1350);
        } else {
            System.out.println("가지고 있는 현금이 부족합니다.");
            return;
        }
    }

    public void showInfo() {
        System.out.println("성명: " + name + ", 현금: " + money);
    }

}
