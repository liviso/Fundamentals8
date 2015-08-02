/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession7;

/**
 *
 * @author Livs
 */
public class ConversionExplicita {
    public static void main(String[] args) {
        char c;
        byte k;
        int p=400;
        double d=145;

        c=(char) d; //Muestra unicode
        k=(byte) p; //Se produce una perdida de datos pero la conversión es posible.
        
        System.out.println(c);
        System.out.println(k);

        int longToInt = (int)20L;
        short doubleToShort = (short)3.0; 
        
    }
}
