
package lession5.sentenciasControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Livs
 */
public class Numeros {
    
    public void valorNumero() throws IOException{   
        //Ingresar la calificación en una escala de 0-100
        
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa tu calificacion de programación ");        
        double cal=Double.parseDouble(entrada.readLine());
       
        if(cal<70){
            System.out.println("No Acreditado");
        }
        else if(cal >= 70 && cal <= 74){
            System.out.println("Regular");
        }
        else if(cal >=75 && cal <= 84){
            System.out.println("Buena");
        }
        else if(cal >= 85 && cal <=94){
            System.out.println("Notable");
        }
        else if(cal >= 95 && cal <=100){
            System.out.println("Excelente");
        }
        else{
            System.out.println("Numero no permitido");
        }     
    }
    
    public static void main (String args []) throws IOException{
        new Numeros().valorNumero();
    }
}
