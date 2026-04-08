package studyclass;

public class Student {
    private int studentId;
    private String studentName;
    private int studentGrade;

    public void setStudentId(int Id) {
        if (Id <= 0) {
            System.out.println("잘못된 id값입니다!");
        } else {
            this.studentId = Id;
        }
    }

    public void setStudentName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("이름은 비워둘 수 없습니다!");
        } else {
            this.studentName = name;
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 4) {
            this.studentGrade = grade;
        } else {
            System.out.println("학년은 1~4 사이여야 합니다!");
        }
    }

    public int getStudentId() {
        return this.studentId;
    }
    public String getStudentName() {
        return this.studentName;
    }
    public int getGrade() {
        return this.studentGrade;
    }
}
