package studyclass;

public class NewMenu {
    String drinkName;
    int espressoShot;

    boolean iced;

    void addShot(int shot) {
        espressoShot = shot;
    }

    void order() {
        System.out.println("Ordering: " + drinkName + (iced ? " (Iced)" : " (Hot)") + " EspressoShot : " + espressoShot);
    }
}
