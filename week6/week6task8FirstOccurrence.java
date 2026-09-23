import java.util.Scanner;

public class week6task8FirstOccurrence {

    public static int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String haystack = sc.next();
        String needle = sc.next();

        System.out.println(strStr(haystack, needle));

        sc.close();
    }
}