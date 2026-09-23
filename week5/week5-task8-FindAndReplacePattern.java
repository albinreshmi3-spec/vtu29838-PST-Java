package week5;
import java.util.Scanner;

public class FindAndReplacePattern {

    public static boolean matches(String word, String pattern) {

        // pattern -> word mapping
        char[] map1 = new char[26];

        // word -> pattern mapping
        char[] map2 = new char[26];

        for (int i = 0; i < pattern.length(); i++) {

            int p = pattern.charAt(i) - 'a';
            int w = word.charAt(i) - 'a';

            // Check pattern -> word mapping
            if (map1[p] != '\0' && map1[p] != word.charAt(i)) {
                return false;
            }

            // Check word -> pattern mapping
            if (map2[w] != '\0' && map2[w] != pattern.charAt(i)) {
                return false;
            }

            map1[p] = word.charAt(i);
            map2[w] = pattern.charAt(i);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String pattern = sc.next();

        for (int i = 0; i < n; i++) {

            if (matches(words[i], pattern)) {
                System.out.print(words[i] + " ");
            }
        }

        sc.close();
    }
}