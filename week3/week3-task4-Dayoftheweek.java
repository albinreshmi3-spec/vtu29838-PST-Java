import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Dayoftheweek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        String result = date.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        System.out.println(result);

        sc.close();
    }
}