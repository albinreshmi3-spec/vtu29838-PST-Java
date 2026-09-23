import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            primary += arr[i][i];
            secondary += arr[i][n - 1 - i];
        }

        int difference = Math.abs(primary - secondary);

        System.out.println(difference);

        sc.close();
    }
}