package studyclass;

public class Car {
    private String model;
    private int year;
    private int price;

    Car(String model) {
        this.model = model;
        year = 2025;
        price = 0;
    }

    Car(String model, int year) {
        this(model);
        if (year >= 1886) {
            this.year = year;
        } else {
            System.out.println("잘못된 연식입니다.");
        }
    }

    Car(String model, int year, int price) {
        this(model, year);
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("잘못된 가격입니다.");
        }
    }

    public void showInfo() {
        System.out.println("모델명: " + model + "(" + year + ") 의 가격은 " + price + "원 입니다.");
    }
}
