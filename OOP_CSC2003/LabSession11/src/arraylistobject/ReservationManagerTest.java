package arraylistobject;

public class ReservationManagerTest {
    public static void main(String[] args) {
        ReservationManager manager = new ReservationManager();

        manager.addPerformance("뮤지컬 A", 2);
        manager.addPerformance("콘서트 B", 1);
        manager.addPerformance("뮤지컬 A", 5);

        manager.reserve("뮤지컬 A");
        manager.reserve("뮤지컬 A");
        manager.reserve("뮤지컬 A");

        manager.reserve("콘서트 B");
        manager.reserve("콘서트 B");

        manager.cancel("뮤지컬 A");
        manager.cancel("연극 C");

        manager.showAllPerformances();
        manager.showSoldOutPerformances();
    }
}