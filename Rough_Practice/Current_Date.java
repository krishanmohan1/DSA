package Rough_Practice;
import java.time.*;

public class Current_Date {
    public static void main(String[] args) {
        {
            LocalDate myObj = LocalDate.now(); // Create a date object
            LocalTime myObj2 = LocalTime.now();
            LocalDateTime f = LocalDateTime.now();
//            System.out.println(myObj); // Display the current date
//            System.out.println(myObj2);
            System.out.println(f);

        }

    }
}
