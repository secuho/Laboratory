package inheritancestudy;

public class ElectricCar extends Car{
    protected int battery;

    public ElectricCar(String model, int battery) {
        super(model);
        this.battery = battery;
    }

    public void chargeBattery() {
        this.battery = 100;
    }

    public void silentDrive() {
        this.speed += 50;
        this.battery -= 10;
    }

    public String showElectricInfo() {
        return "전기차의 배터리를 충전합니다. (배터리: " + battery + "%)";
    }
}
