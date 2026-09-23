import java.util.Scanner;

public class HalvesAreAlike {

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int mid = s.length() / 2;
        int first = 0;
        int second = 0;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                first++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                second++;
            }
        }

        if (first == second) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}