package studyarray;

import javax.xml.transform.Source;

public class MaxFinder {
    public static void main(String[] args) {
        int[][] scores = { {90, 80, 95}, {100, 80, 90} };

        int sum = 0;
        int max = 100;
        int maxR = -1, maxC = -1;

        for (int i=0; i< scores.length; i++) {
            for (int j=0; j< scores[i].length; j++) {
                int v = scores[i][j];
                sum += v;
                if (v >= max) {
                    max = v;
                    maxR = i;
                    maxC = j;
                }
            }
        }
        System.out.println("총합: " + sum);
        System.out.println("최댓값: " + max + " (행=" + maxR + ", 열=" + maxC + ")");
    }
}
