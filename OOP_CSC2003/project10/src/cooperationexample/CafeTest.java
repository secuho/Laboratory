package cooperationexample;


public class CafeTest {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Barista bestBarista = new Barista("Kim", 0);
        CafeCustomer alice = new CafeCustomer("Alice", 3000);
        MenuItem americano = new MenuItem("Americano", 2000);
        MenuItem latte = new MenuItem("Latte", 2800);

        cafe.order(alice, americano, bestBarista);
        cafe.order(alice, latte, bestBarista);
        alice.charge(2000);
        cafe.order(alice, latte, bestBarista);

        alice.showInfo();
        Cafe.showTotalSales();
        System.out.println(bestBarista.getName() + "의 인센티브: " + bestBarista.getIncentive());
    }
}
