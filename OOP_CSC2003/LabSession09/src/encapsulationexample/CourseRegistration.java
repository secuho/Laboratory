package encapsulationexample;

public class CourseRegistration {
    static int totalRegistrations;

    private String studentName;
    private String courseName;
    private int tuition;
    private boolean isRegistered;

    CourseRegistration(String studentName, String courseName, int tuition) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.tuition = tuition;
        isRegistered = false;
    }

    public void register() {
        if (isRegistered == false) {
            totalRegistrations++;
            isRegistered = true;
        } else {
            System.out.println("이미 수강 신청이 완료되었습니다.");
        }
    }

    public void cancel() {
        if (isRegistered) {
            totalRegistrations--;
            isRegistered = false;
        } else {
            System.out.println("신청된 내역이 없습니다.");
        }
    }

    public void showRegistrationInfo() {
        System.out.println(studentName + "님이 수강중인 " + courseName + " 과목이 신청되었습니다. (등록금: " + tuition + ")");
    }

    public static void showTotalRegistrations() {
        System.out.println("전체 신청 수: " + totalRegistrations);
    }
}
