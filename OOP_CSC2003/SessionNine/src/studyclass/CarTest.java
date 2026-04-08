package studyclass;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Sonata");
        Car car2 = new Car("Avante", 2022);
        Car car3 = new Car("Grandeur", 1500, -5000);

        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }
}