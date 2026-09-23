package week6;
package week5;
import java.util.Scanner;
import java.util.HashSet;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<Character>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Remove characters until duplicate is removed
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(lengthOfLongestSubstring(s));

        sc.close();
    }
}