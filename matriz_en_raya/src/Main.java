import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        int[][][][] sudoku = new int[3][3][3][3];

        sudoku = inicializarSudoku(sudoku);

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

    public static int[][][][] inicializarSudoku(int[][][][] sudoku) {

        Random random = new Random();
        int[] numeros;
        int pos;

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                for (int k = 0; k < sudoku[i][j].length; k++) {
                    for (int l = 0; l < sudoku[i][j][k].length; l++) {

                        sudoku[i][j][k][l] = 0;

                    }
                }
            }
        }

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                numeros = inicializarNumeros();
                for (int k = 0; k < sudoku[i][j].length; k++) {
                    for (int l = 0; l < sudoku[i][j][k].length; l++) {
                        do {
                            pos = random.nextInt(numeros.length);
                            sudoku[i][j][k][l] = numeros[pos];
                            numeros = quitarNumero(numeros, pos);
                        } while ();
                    }
                }
            }
        }

        return sudoku;
    }

    public static int[] inicializarNumeros() {

        int[] numeros = new int[9];
        int cont = 1;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = cont;
            cont++;
        }

        return numeros;
    }

    public static int[] quitarNumero(int[] numeros, int pos) {

        int[] newNumeros = new int[numeros.length - 1];
        int guardar;

        for (int i = pos; i < numeros.length; i++) {
            if (i != numeros.length - 1) {
                guardar = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = guardar;
            }
        }

        for (int i = 0; i < newNumeros.length; i++) {
            newNumeros[i] = numeros[i];
        }

        return newNumeros;
    }

}