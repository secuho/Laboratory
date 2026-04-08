package cooperationexample;

public class CafeTest {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        CafeCustomer alice = new CafeCustomer("Alice", 3000);
        MenuItem americano = new MenuItem("Americano", 2000);
        MenuItem latte = new MenuItem("Latte", 2800);

        cafe.order(alice, americano);
        cafe.order(alice, latte);
        alice.charge(2000);
        cafe.order(alice, latte);

        alice.showInfo();
        Cafe.showTotalSales();
    }
}
