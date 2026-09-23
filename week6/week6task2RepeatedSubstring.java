import java.util.Scanner;

public class week6task2RepeatedSubstring {

    public static boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {

            if (n % len == 0) {

                String part = s.substring(0, len);
                StringBuilder result = new StringBuilder();

                for (int i = 0; i < n / len; i++) {
                    result.append(part);
                }

                if (result.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(repeatedSubstringPattern(s));

        sc.close();
    }
}