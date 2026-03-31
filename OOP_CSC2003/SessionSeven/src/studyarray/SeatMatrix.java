package studyarray;

public class SeatMatrix {
    public static void main (String[] args) {

        String[][] seats = new String[2][3];
        seats[0][0]="A1"; seats[0][1]="A2"; seats[0][2]="A3";
        seats[1][0]="B1"; seats[1][1]="B2"; seats[1][2]="B3";

        for (int i=0; i<seats.length; i++) {
            for (int j=0; j<seats[i].length; j++) {
                System.out.println("[" + i + "][" + j + "]=" + seats[i][j]);
            }
        }
        int total = seats.length * seats[0].length;
        System.out.println("총 원소: " + total);
    }
}
