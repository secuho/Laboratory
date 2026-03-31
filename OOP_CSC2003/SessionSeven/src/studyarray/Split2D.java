package studyarray;

public class Split2D {
    public static void main() {
        String input = "Kor,Math,Eng;Hist,CS;PE,Music";
        String[] rows = input.split(";");
        String[][] subjects = new String[rows.length][];

        for (int i=0; i<rows.length; i++) {
            subjects[i] = rows[i].split(",");
        }

        for (int i=0; i<subjects.length; i++) {
            for (int j=0; j<subjects[i].length; j++) {
                System.out.print(subjects[i][j] + " ");
            }
            System.out.println();
        }
    }
}
