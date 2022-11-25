import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        int[][][][] sudoku = new int[3][3][3][3];

        inicializarSudoku(sudoku);

    }

    public static void imprimirSudoku(int[][][][] sudoku) {

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                for (int k = 0; k < sudoku[i][j].length; k++) {
                    for (int l = 0; l < sudoku[i][j][k].length; l++) {

                        System.out.print(sudoku[i][j][k][l] + "  ");

                    }
                    System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void inicializarSudoku(int[][][][] sudoku) {

        Random random = new Random();
        int num;
        int[] posiciones = new int[4];

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                for (int k = 0; k < sudoku[i][j].length; k++) {
                    for (int l = 0; l < sudoku[i][j][k].length; l++) {

                        sudoku[i][j][k][l] = 0;

                    }
                }
            }
        }

        do {
            posiciones = posRandom(posiciones);
        } while ();

    }

    public static int[] posRandom(int[] posiciones) {

    }

}