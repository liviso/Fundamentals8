
package lession11.dates;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.MINUTES;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime nowPlus=now.plusHours(1).plusMinutes(15);
        
        System.out.println("Ahora es: "+now);
        System.out.println("Qúe tiempo es ahora? "+nowPlus);
        
        LocalTime nowHrsMins=now.truncatedTo(MINUTES);
        System.out.println(nowHrsMins);
    }
}
