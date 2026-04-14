package arraylistobject;

public class Scholarship {
    private String name;
    private int threshold;

    public Scholarship(String name, int threshold) {
        this.name = name;
        this.threshold = threshold;
    }

    public void checkScholarship(Student student, int totalScore) {
        if (totalScore >= threshold) {
            System.out.println("[" + name + "] 학생은 장학금 대상자입니다!");
        } else {
            System.out.println("[" + name + "] 학생은 장학금 대상자가 아닙니다.");
        }
        return;
    }
}
