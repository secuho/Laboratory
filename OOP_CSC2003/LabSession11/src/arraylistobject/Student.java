package arraylistobject;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;

    private ArrayList<Subject> subjectList;
    private ArrayList<Scholarship> scholarshipList;

    public Student(int Id, String name) {
        this.studentId = Id;
        this.studentName = name;
        subjectList = new ArrayList<>();
        scholarshipList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject s : subjectList) {
            total += s.getScorePoint();
            System.out.println(studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint());
        }
        System.out.println(studentName + "의 총점은 " + total);

        for (Scholarship scholarship : scholarshipList) {
            scholarship.checkScholarship(this, total);
        }
    }

    public void addScholarship(Scholarship scholarship) {
        scholarshipList.add(scholarship);
    }


}
