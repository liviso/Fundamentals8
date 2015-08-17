
package lession11.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDate {
    public static void main(String[] args) {
        
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDate date1= LocalDate.now();
        String formattedDate=date1.format(formatter);
        System.out.println(formattedDate);
        
       
    
    }
}
