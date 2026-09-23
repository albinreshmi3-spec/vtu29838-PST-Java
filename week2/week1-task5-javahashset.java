import java.util.HashSet;

public class Task5 {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, ignored

        System.out.println(fruits);

        // Checking element
        System.out.println(fruits.contains("Banana"));

        // Removing element
        fruits.remove("Orange");

        System.out.println(fruits);

        // Size
        System.out.println("Size: " + fruits.size());
    }
}