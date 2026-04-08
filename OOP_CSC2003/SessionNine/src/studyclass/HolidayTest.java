package studyclass;

public class HolidayTest {
        public static void main(String[] args) {
            Holiday h1 = new Holiday("추석", 10, 6, "한국");
            h1.showInfo();

            Holiday h2 = new Holiday("크리스마스", 13, 25, "미국");
            h2.showInfo();

            Holiday h3 = new Holiday("만우절", 4, 50, "세계");
            h3.showInfo();

            Holiday h4 = new Holiday("", 10, 3, "한국");
            h4.showInfo();
        }
}