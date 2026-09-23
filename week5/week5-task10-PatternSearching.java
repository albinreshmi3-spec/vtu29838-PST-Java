package week5;
import java.util.Scanner;

public class PatternSearching {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {

            int j;

            // Compare pattern with text starting at index i
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If all characters matched
            if (j == m) {
                System.out.print(i);
            }
        }

        sc.close();
    }
}