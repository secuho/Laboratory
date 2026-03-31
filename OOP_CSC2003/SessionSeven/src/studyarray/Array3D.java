package studyarray;

public class Array3D {
    public static void main(String[] args) {
        int[][][] cube = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}}
                };

        for (int i=0; i<cube.length; i++) {
            for (int j=0; j<cube[i].length; j++) {
                for (int k=0; k<cube[i][j].length; k++) {
                    if (cube[i][j][k] % 2 != 0)
                        cube[i][j][k] += 1;
                }
            }
        }

        for (int i=0; i<cube.length; i++) {
            for (int j=0; j<cube[i].length; j++) {
                for (int k=0; k<cube[i][j].length; k++) {
                    System.out.println("cube[" + i + "][" + j + "][" + k + "] = " + cube[i][j][k]);
                }
            }
        }


    }
}
