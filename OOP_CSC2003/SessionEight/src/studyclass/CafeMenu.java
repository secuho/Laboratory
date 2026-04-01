package studyclass;

public class CafeMenu {
    String drinkName;

    boolean iced;

    void order() {
        System.out.println("Ordering: " + drinkName + (iced ? " (Iced)" : " (Hot)"));
    }
}
