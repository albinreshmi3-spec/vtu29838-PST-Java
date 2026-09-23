import java.util.Scanner;

public class week6task10RotationPalindrome {

    // Find the longest palindromic substring using Manacher's Algorithm
    public static int longestPalindrome(String s) {

        int n = s.length();

        // Transformed string:
        // "abba" -> "^#a#b#b#a#$"
        char[] t = new char[2 * n + 3];

        t[0] = '^';

        int index = 1;

        for (int i = 0; i < n; i++) {
            t[index++] = '#';
            t[index++] = s.charAt(i);
        }

        t[index++] = '#';
        t[index] = '$';

        int[] p = new int[t.length];

        int center = 0;
        int right = 0;
        int maxLength = 0;

        for (int i = 1; i < t.length - 1; i++) {

            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            while (t[i + (1 + p[i])] == t[i - (1 + p[i])]) {
                p[i]++;
            }

            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            if (p[i] > maxLength) {
                maxLength = p[i];
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        // Generate every rotation
        for (int i = 0; i < n; i++) {

            String rotation = s.substring(i) + s.substring(0, i);

            System.out.println(longestPalindrome(rotation));
        }

        sc.close();
    }
}