import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n == 1)
            System.out.println("Fibonacci number = " + a);
        else if (n == 2)
            System.out.println("Fibonacci number = " + b);
        else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Fibonacci number = " + c);
        }

        sc.close();
    }
}