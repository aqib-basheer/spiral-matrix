
/**
 * spiral matrix
 */
public class Matrix {

    public static void main(String[] args) {
        int m = 3;
        int n = 6;
        int[][] a = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        spiralPrint(m, n, a); // function call
    }

    static void spiralPrint(int rows, int columns, int[][] a) // fxn definition
    {
        int i, k = 0;
        int l = 0;
        while (k < rows && l < columns) {
            for (i = l; i < columns; i++) {
                System.out.println(a[k][i] + " ");
            }
            k++;
            for (i = k; i < rows; i++) {
                System.out.println(a[i][columns - 1] + " ");
            }
            columns--;
            if (k < rows) {
                for (i = columns - 1; i >= l; i--) {
                    System.out.println(a[rows - 1][i] + " ");
                }
                rows--;
                if (l < columns) {
                    for (i = rows - 1; i >= k; i--) {
                        System.out.println(a[i][columns - 1] + " ");
                    }
                }

            }

        }

    }
}
