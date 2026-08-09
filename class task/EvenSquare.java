public class EvenSquare {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Even numbers and their squares:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                int square = arr[i] * arr[i];

                System.out.println(arr[i] + " -> " + square);
            }
        }
    }
}