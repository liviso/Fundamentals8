/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession11.dates;

import java.time.LocalDate;

/**
 *
 * @author Livs
 */
public class Today {
    public static void main(String[] args) {
        LocalDate myDate =  LocalDate.now();
        System.out.println("Today's date: "+ myDate);

    }
}
