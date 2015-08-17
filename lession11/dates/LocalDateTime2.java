/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession11.dates;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author Livs
 */
public class LocalDateTime2 {
    public static void main(String[] args) {
        LocalDateTime from =LocalDateTime.of(2014, Month.AUGUST, 16, 0, 0,0);
         LocalDateTime to=LocalDateTime.of(2015, Month.AUGUST, 16, 23, 59, 59);
         
         Duration duration=Duration.between(from, to);
         System.out.println("Duration in days: "+duration.toDays());
         System.out.println("Duration in hours: "+duration.toHours());
    }
}
