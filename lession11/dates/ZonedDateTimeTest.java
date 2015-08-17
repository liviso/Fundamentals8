
package lession11.dates;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
    public static void main(String[] args) {
        
        Clock clock = Clock.systemUTC();
        
        ZonedDateTime zoneDateTime=ZonedDateTime.now();
        ZonedDateTime zonedDateTimeClock=ZonedDateTime.now(clock);
        ZonedDateTime zoneDateTimeZone=ZonedDateTime.now(ZoneId.of("America/Mexico_City"));
   
        System.out.println(zoneDateTime);
        System.out.println(zonedDateTimeClock);
        System.out.println(zoneDateTimeZone);
    }
}
