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
public class Test {
    public static void main(String[] args) {
       String texto="Primero resuelves el problema, después escribes el código";
        String cadena="Primero";

        if(texto.contains(cadena)){
            System.out.println("Se encuentra la cadena");
        }
        else{
             System.out.println("No se encuentra la cadena");
        }


    }
}
