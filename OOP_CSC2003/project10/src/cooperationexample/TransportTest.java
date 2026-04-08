package cooperationexample;

public class TransportTest {
    public static void main(String[] args) {
        Student s1 = new Student("Lee", 3000);
        Student s2 = new Student("Park", 1000);

        Bus bus701 = new Bus(701);
        Subway subway2 = new Subway("2");

        s1.takeBus(bus701);
        s1.takeSubway(subway2);
        s2.takeSubway(subway2);

        s1.showInfo();
        s2.showInfo();
        bus701.showInfo();
        subway2.showInfo();
    }
}
