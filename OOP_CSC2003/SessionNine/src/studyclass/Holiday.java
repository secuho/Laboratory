package studyclass;

public class Holiday {
    private String name;
    private int month;
    private int day;
    String country;

    void setName(String name) {
        if (name == null) {
            System.out.println("휴일 이름은 비워둘 수 없습니다.");
        } else {
            name = this.name;
        }
    }

    void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("월은 1~12가 아니면 안됩니다 ");
        }
    }
}
