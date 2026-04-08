package encapsulationexample;

public class MileageAccount {
    private String ownerName;
    private int mileage;

    MileageAccount(String ownerName, int initialMileage) {
        this.ownerName = ownerName;
        this.mileage = initialMileage;
    }

    public void addMileage(int amount) {
        if (amount > 0) {
            mileage += amount;
            System.out.println(amount + " 마일리지를 적립했습니다. (잔액: " + mileage + ")");
        } else {
            System.out.println("적립 마일리지는 0보다 커야 합니다.");
        }
    }

    public void useMileage(int amount) {
        if (amount > 0) {
            if (mileage > amount) {
                mileage -= amount;
                System.out.println(amount + " 마일리지를 사용했습니다. (잔액: " + mileage + ")");
            } else {
                System.out.println("마일리지가 부족합니다.");
            }
        } else {
            System.out.println("적립 마일리지는 0보다 커야 합니다.");
        }
    }

    public int getMileage() {
        return mileage;
    }

    public void showInfo() {
        System.out.println(ownerName + "님의 현재 마일리지: " + mileage);
    }
}
