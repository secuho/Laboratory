package encapsulationexample;

public class Order {
    static int totalOrders;

    private String productName;
    private int price;

    public Order(String name, int price) {
        this.productName = name;
        this.price = price;
        totalOrders++;
    }

    public void showOrderInfo() {
        System.out.println("상품명: " + productName + ", 가격: " + price);
    }

    public static void showTotalOrders() {
        System.out.println("전체 주문 건수: " + totalOrders);
    }

}
