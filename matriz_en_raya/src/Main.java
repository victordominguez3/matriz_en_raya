import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        String[][][][] tablero = new String[3][3][3][3];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                for (int k = 0; k < tablero[i][j].length; k++) {
                    for (int l = 0; l < tablero[i][j][k].length; l++) {

                        tablero[i][j][k][l] = "-";
                        System.out.print(tablero[i][j][k][l] + "  ");

                    }
                    System.out.print("   ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}