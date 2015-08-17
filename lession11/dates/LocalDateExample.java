
package lession11.dates;

import static java.lang.System.out;
import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2015, 8, 6);
         
        out.println("Today: " + today);
        out.println("Month: " + today.getMonth());
        out.println("Year: " + today.getYear());
        
        LocalDate thirtyDaysFromNow = today.plusDays(30);
        out.println(thirtyDaysFromNow);
        
        out.println("Date: " + thirtyDaysFromNow);	   
    }
}
