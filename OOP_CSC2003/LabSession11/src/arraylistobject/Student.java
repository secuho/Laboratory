package arraylistobject;

import java.util.ArrayList;
public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectlist;
    private ArrayList<Scholarship> scholarshipList;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        subjectlist = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectlist.add(subject);
        scholarshipList = new ArrayList<Scholarship>();
    }

    public void addScholarship(Scholarship scholarship) {
        scholarshipList.add(scholarship);

    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject s : subjectlist) {
            total += s.getScorePoint();
            System.out.println(studentName + "의 " +
                    s.getName() + " 과목 성적은 " + s.getScorePoint());
        }
        System.out.println(studentName + "의 총점은 " + total);

        for(Scholarship s: scholarshipList) {
            s.checkScholarship(this, total);
        }
    }
}
