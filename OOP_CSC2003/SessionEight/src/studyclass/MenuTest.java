package studyclass;

public class MenuTest {
    public static void main(String[] args) {

        CafeMenu cafe1 = new CafeMenu();
        CafeMenu cafe2 = new CafeMenu();
        CafeMenu cafe3 = new CafeMenu();

        cafe1.drinkName = "아메리카노";
        cafe2.drinkName = "카페라떼";
        cafe3.drinkName = "카라멜마키야토";

        cafe1.iced = true;
        cafe2.iced = false;
        cafe3.iced = true;

        cafe1.order();
        cafe2.order();
        cafe3.order();

    }
}
