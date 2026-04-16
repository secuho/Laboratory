package inheritancestudy;

public class Car {
    protected String model;
    protected int speed;

    public Car(String name) {
        this.model = name;
        this.speed = 0;
    }

    public String showInfo() {
        return "모델명: " + model + ", 현재속도: " + speed + "km/h";
    }
}
