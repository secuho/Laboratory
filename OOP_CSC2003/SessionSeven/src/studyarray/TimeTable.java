package studyarray;

public class TimeTable {
    public static void main(String[] args) {

        String[][] timetable = new String[3][];
        timetable[0] = new String[] {"Kor", "Math"};
        timetable[1] = new String[] {"Eng", "Hist", "CS"};
        timetable[2] = new String[] {"PE"};

        for (int i=0; i < timetable.length; i++) {
            System.out.print(i + "행(" + timetable[i].length + "과목): ");
                for (String sub : timetable[i])
                    System.out.print(sub + " ");
            System.out.println();
        }
    }
}
