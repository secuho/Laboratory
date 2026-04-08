package cooperationexample;

public class Order {
    static int totalOrders = 0;

    private String productName;
    private int price;

    public Order(String name, int price) {
        this.productName = name;
        this.price = price;
        totalOrders++;
    }

    public void showOrderInfo() {
        System.out.println("상품명: " + productName + ", 가격: " + price + "원");
    }

    public static void showTotalOrders() {
        System.out.println("총 주문 건수: " + totalOrders);
    }
}
