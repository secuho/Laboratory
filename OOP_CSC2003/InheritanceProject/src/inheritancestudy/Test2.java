package inheritancestudy;

public class Test2 {
    public static void main(String[] args) {

        Car normal = new Car("소나타");
        System.out.println(normal.showInfo());

        System.out.println();

        ElectricCar tesla = new ElectricCar("Model 3", 100);
        tesla.silentDrive();
        System.out.println(tesla.showElectricInfo());
        tesla.chargeBattery();
        System.out.println(tesla.showElectricInfo());
    }
}
