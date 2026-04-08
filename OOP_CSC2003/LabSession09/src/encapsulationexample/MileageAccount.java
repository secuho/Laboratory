package encapsulationexample;

class MileageAccount {
    private String ownerName;
    private int mileage;

    public MileageAccount(String ownerName, int initialMileage) {
        this.ownerName = ownerName;
        this.mileage = initialMileage;
    }

    public void addMileage(int amount) {
        if (amount <= 0) {
            System.out.println("적립 마일리지는 0보다 커야 합니다.");
            return;
        }
        mileage += amount;
    }

    public void useMileage(int amount) {
        if (amount <= 0) {
            System.out.println("사용 마일리지는 0보다 커야 합니다.");
            return;
        }

        if (amount > mileage) {
            System.out.println("마일리지가 부족합니다.");
            return;
        }

        mileage -= amount;
    }

    public int getMileage() {
        return mileage;
    }

    public void showInfo() {
        System.out.println("소유자: " + ownerName + ", 현재 마일리지: " + mileage);
    }
}
