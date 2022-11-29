import java.util.ArrayList;
import java.util.Collections;

public class Sudoku_Internet {

    public static void main(String[] args) {
        int[][] sudoku = createSudoku();

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                System.out.print(sudoku[i][j] + "  ");
                if (j == 2 || j == 5 || j == 8) {
                    System.out.print("  ");
                }
            }
            System.out.println();
            if (i == 2 || i == 5 || i == 8) {
                System.out.println();
            }
        }
    }

    private static int[][] createSudoku()
    {
        int[][] field = new int[9][9];

        for(int i = 0; i < field.length; i++)
        {
            int[] rand;
            do {
                rand = createRandomRange();
                System.arraycopy(rand, 0, field[i], 0, rand.length);
            }
            while(!proofIntField(field));
        }
        return field;
    }

    private static boolean proofIntField(int[][] field)
    {
        for(int i = 0; i < field.length; i++)
        {
            if(!proofNoDuplicate(field[i])) {
                return false;
            }
        }

        for(int i = 0; i < 9; i++)
        {
            int[] temp = new int[9];
            for(int j = 0; j < 9; j++)
            {
                temp[j] = field[j][i];
            }
            if(!proofNoDuplicate(temp)) {
                return false;
            }
        }

        for(int i = 0; i < 9; i += 3)
        {
            for(int j = 0; j < 9; j += 3)
            {
                int[] temp = new int[9];
                int h = 0;
                for(int k = 0; k < 3; k++)
                {
                    for(int g = 0; g < 3; g++)
                    {
                        temp[h] = field[i+k][j+g];
                        h++;
                    }
                }
                if(!proofNoDuplicate(temp)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean proofNoDuplicate(int[] field)
    {
        int[] temp = new int[9];
        for(int i = 0; i < field.length; i++)
        {
            if(field[i] != 0) {
                for(int j:temp)
                {
                    if(j == field[i]) {
                        return false;
                    }
                }
                temp[i] = field[i];
            }
        }
        return true;
    }

    private static int[] createRandomRange()
    {
        int[] field = new int[9];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= 9; i++)
        {
            list.add(i);
        }
        Collections.shuffle(list);
        for(int i = 0; i < 9; i++)
        {
            field[i] = list.get(i).intValue();
        }
        return field;
    }

}
