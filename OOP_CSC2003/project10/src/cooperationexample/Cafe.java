package cooperationexample;

public class Cafe {
    private static int totalSales = 0;

    public void order(CafeCustomer c, MenuItem item) {
        int tempPrice = item.getPrice();
        if (c.getMoney() >= tempPrice) {
            c.pay(tempPrice);
            totalSales += tempPrice;
        } else {
            System.out.println("잔액이 부족합니다.");
            return;
        }
    }

    public static void showTotalSales() {
        System.out.println("총 매출: " + totalSales + "원");
    }


}
