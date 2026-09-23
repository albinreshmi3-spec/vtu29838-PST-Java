package week5;
import java.util.Scanner;

public class StringMatching {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i != j && words[j].contains(words[i])) {
                    System.out.print(words[i] + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}