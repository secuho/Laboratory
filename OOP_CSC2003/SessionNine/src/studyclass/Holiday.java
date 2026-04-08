package studyclass;

public class Holiday {
    private String name;
    private int month;
    private int day;
    String country;

    public Holiday(String name, int month, int day, String country) {
        setName(name);
        setMonth(month);
        setDay(day);
        this.country = country;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("휴일 이름은 비워둘 수 없습니다!");
        } else {
            this.name = name;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("월은 1~12 사이여야 합니다!");
        }
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("일(day)는 1~31 사이여야 합니다!");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void showInfo() {
        System.out.println("Holiday name: " + name + " in " + country);
        System.out.println("Holiday: " + month + "/" + day);
    }
}
