

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Date: " + now.format(format));
        System.out.println("Day: " + now.getDayOfMonth());
        System.out.println("Month: " + now.getMonth());
        System.out.println("Year: " + now.getYear());
        System.out.println("Time: " + now.toLocalTime());
    }
}