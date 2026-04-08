package studyclass;

public class StudentTest {
        public static void main(String[] args) {
            Student student1 = new Student();
            student1.setStudentId(1001);
            student1.setStudentName("James");
            student1.setGrade(3);

            Student student2 = new Student();
            student2.setStudentId(1002);
            student2.setStudentName("");
            student2.setGrade(5);

            System.out.println("StudentID: " + student1.getStudentId());
            System.out.println("Name: " + student1.getStudentName());
            System.out.println("Grade: " + student1.getGrade());
            System.out.println();
            System.out.println("StudentID: " + student2.getStudentId());
            System.out.println("Name: " + student2.getStudentName());
            System.out.println("Grade: " + student2.getGrade());
        }
}
