package encapsulationexample;

public class OrderTest {
    public static void main(String[] args) {

        Order o1 = new Order("Keyboard", 45000);
        Order o2 = new Order("Mouse", 19000);

        o1.showOrderInfo();
        o2.showOrderInfo();

        Order.showTotalOrders();

    }
}
