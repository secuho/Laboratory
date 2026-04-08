package encapsulationexample;

public class MileageAccountTest {
    public static void main(String[] args) {

        MileageAccount acc = new MileageAccount("Kim", 1000);

        acc.showInfo();

        acc.addMileage(500);
        acc.useMileage(300);
        acc.useMileage(2000);
        acc.addMileage(-100);

        acc.showInfo();


    }
}
