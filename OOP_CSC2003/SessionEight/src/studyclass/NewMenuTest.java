package studyclass;

public class NewMenuTest {
    public static void main(String[] args) {

        NewMenu cafe1 = new NewMenu();
        NewMenu cafe2 = new NewMenu();
        NewMenu cafe3 = new NewMenu();

        cafe1.drinkName = "아메리카노";
        cafe2.drinkName = "카페라떼";
        cafe3.drinkName = "카라멜마키야토";

        cafe1.iced = true;
        cafe2.iced = false;
        cafe3.iced = true;

        cafe1.espressoShot = 0;
        cafe2.espressoShot = 0;
        cafe3.espressoShot = 0;

        cafe1.addShot(3);
        cafe2.addShot(3);
        cafe3.addShot(3);

        cafe1.order();
        cafe2.order();
        cafe3.order();

    }
}
