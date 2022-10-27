import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        int m, n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter M:");
        m = inp.nextInt();
        System.out.println("Enter N:");
        n = inp.nextInt();
        int[][] unTransposed = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                unTransposed[i][j] = (int) (Math.random() * 9);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(unTransposed[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transposed matrix:");
        int[][] transposed = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = unTransposed[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
