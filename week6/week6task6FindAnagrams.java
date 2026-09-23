import java.util.*;

public class week6task6FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<Integer>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Count characters in p
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }

        int windowSize = p.length();

        // Create first window
        for (int i = 0; i < windowSize; i++) {
            windowCount[s.charAt(i) - 'a']++;
        }

        // Check first window
        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }

        // Slide the window
        for (int i = windowSize; i < s.length(); i++) {

            // Add new character
            windowCount[s.charAt(i) - 'a']++;

            // Remove old character
            windowCount[s.charAt(i - windowSize) - 'a']--;

            // Check if current window is an anagram
            if (Arrays.equals(pCount, windowCount)) {
                result.add(i - windowSize + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String p = sc.next();

        List<Integer> result = findAnagrams(s, p);

        System.out.println(result);

        sc.close();
    }
}