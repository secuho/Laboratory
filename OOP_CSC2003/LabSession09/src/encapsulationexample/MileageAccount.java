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
        } else {
            System.out.println("적립 마일리지는 0보다 커야 합니다.");
        }
    }

    public void useMileage(int amount) {
        if (amount > 0) {
            if (mileage > amount) {
                mileage -= amount;
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
        System.out.println("소유자: " + ownerName + ", 현재 마일리지: " + mileage);
    }
}
