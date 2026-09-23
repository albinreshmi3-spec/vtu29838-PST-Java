import java.util.Scanner;
import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                duplicate = true;
                break;
            }

            set.add(nums[i]);
        }

        System.out.println(duplicate);

        sc.close();
    }
}