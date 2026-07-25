import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int last1 = a % 10;
        int last2 = b % 10;

        System.out.println("Sum of last digits = " + (last1 + last2));

        sc.close();
    }
}