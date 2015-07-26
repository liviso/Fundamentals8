
package lession5.sentenciasControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Livs
 */
public class CompruebaPar {
    
    public static void main (String []args) throws IOException{
        
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa un número entero");
        int numero=Integer.parseInt(entrada.readLine());
        
        if(numero%2==0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
        
        
    }
}
