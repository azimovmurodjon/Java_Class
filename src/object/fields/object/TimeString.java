package object.fields.object;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
Output

2017-07-25
In the above program, we've used the predefined formatter ISO_DATE that takes date string in the format 2017-07-25 or 2017-07-25+05:45'.

The LocalDate's parse() function parses the given string using the given formatter. You can also remove the ISO_DATE formatter in the above example and replace the parse() method with:

LocalDate date = LocalDate.parse(string, DateTimeFormatter);
 */
public class TimeString {

    public static void main(String[] args) {
        // Format y-M-d or yyyy-MM-d
        String string = "2023-07-06";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);
    }
}

/*
Output

2017-07-25
In the above program, our date is in the format MMMM d, yyyy. So, we create a formatter of the given pattern. Check all DateTimeFormatter patterns, if you're interested.

Now, we can parse the date using LocalDate.parse() function and get the LocalDate object.
 */
class TimeString2 {
    public static void main(String[] args) {
        String string = "July 25, 2017";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);

        System.out.println(date);
    }
}