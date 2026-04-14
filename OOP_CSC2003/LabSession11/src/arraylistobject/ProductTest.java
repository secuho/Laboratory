package arraylistobject;

import java.util.ArrayList;

class ProductTest {
    public static void main(String[] args) {

        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("Keyboard", 30000));
        list.add(new Product("Mouse", 15000));

        int sum = 0;

        for (Product p : list) {
            System.out.println(p.getName() + " - " + p.getPrice());
            sum += p.getPrice();
        }

        System.out.println("총합: " + sum);
    }
}