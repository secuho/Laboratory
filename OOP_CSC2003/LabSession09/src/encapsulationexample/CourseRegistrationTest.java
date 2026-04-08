package encapsulationexample;

public class CourseRegistrationTest {
    public static void main(String[] args) {

                CourseRegistration c1 = new CourseRegistration("Kim", "Java Programming", 300000);
                CourseRegistration c2 = new CourseRegistration("Lee", "Data Structure", 350000);

                c1.showRegistrationInfo();
                c2.showRegistrationInfo();
                CourseRegistration.showTotalRegistrations();

                c1.register();
                c2.register();
                CourseRegistration.showTotalRegistrations();

                c1.register();
                c1.cancel();
                c1.cancel();

                c1.showRegistrationInfo();
                c2.showRegistrationInfo();
                CourseRegistration.showTotalRegistrations();

    }
}
