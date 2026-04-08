package cooperationexample;

public class Cafe {
    private static int totalSales = 0;

    public void order(CafeCustomer c, MenuItem item, Barista barista) {
        int tempPrice = item.getPrice();
        if (c.getMoney() >= tempPrice) {
            c.pay(tempPrice);
            totalSales += tempPrice;
            barista.addIncentive();
        } else {
            System.out.println("잔액이 부족합니다.");
            return;
        }
    }

    public static void showTotalSales() {
        System.out.println("총 매출: " + totalSales + "원");
    }


}
