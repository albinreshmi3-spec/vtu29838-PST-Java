import java.util.Scanner;

public class week6task4RotateString {

    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String combined = s + s;

        return combined.contains(goal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String goal = sc.next();

        System.out.println(rotateString(s, goal));

        sc.close();
    }
}