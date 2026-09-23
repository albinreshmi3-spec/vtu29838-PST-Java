package week5;
import java.util.Scanner;

public class TheMaximumSubarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Maximum Subarray - Kadane's Algorithm
            int currentSum = arr[0];
            int maxSubarray = arr[0];

            for (int i = 1; i < n; i++) {
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxSubarray = Math.max(maxSubarray, currentSum);
            }

            // Maximum Subsequence
            int maxSubsequence = 0;
            int largestElement = arr[0];

            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    maxSubsequence += arr[i];
                }

                if (arr[i] > largestElement) {
                    largestElement = arr[i];
                }
            }

            // If all elements are negative
            if (maxSubsequence == 0) {
                maxSubsequence = largestElement;
            }

            System.out.println(maxSubarray + " " + maxSubsequence);
        }

        sc.close();
    }
}