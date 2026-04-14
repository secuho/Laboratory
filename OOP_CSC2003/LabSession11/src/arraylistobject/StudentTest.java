package arraylistobject;

public class StudentTest {
    public static void main(String[] args) {
        Scholarship scholarship1 = new Scholarship("교내 장학금", 200);
        Scholarship scholarship2 = new Scholarship("우수 장학금", 250);

        Student studentLee = new Student(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);
        studentLee.addSubject("영어", 70);
        studentLee.addScholarship(scholarship1);
        studentLee.addScholarship(scholarship2);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);
        studentKim.addScholarship(scholarship1);
        studentKim.addScholarship(scholarship2);

        studentLee.showStudentInfo();
        System.out.println("==============================");
        studentKim.showStudentInfo();
    }
}