import java.util.Scanner;

public class MatrixBlockSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        // Input matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();

        int[][] answer = new int[m][n];

        // Calculate block sum
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int sum = 0;

                int startRow = Math.max(0, i - k);
                int endRow = Math.min(m - 1, i + k);

                int startCol = Math.max(0, j - k);
                int endCol = Math.min(n - 1, j + k);

                for (int r = startRow; r <= endRow; r++) {
                    for (int c = startCol; c <= endCol; c++) {
                        sum += mat[r][c];
                    }
                }

                answer[i][j] = sum;
            }
        }

        // Print answer
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}