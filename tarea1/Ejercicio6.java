//Leer 5 números negativos y convertirlos a positivos, e imprimirlos.
package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Livs
 */
public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        
         BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        
        int arr[]=new int [5];

        for(int x=0; x<arr.length; x++){
        System.out.println("Ingresa un nùmero ");       
        arr[x]=Integer.parseInt(entrada.readLine());
        
        if(arr[x]<0){
         arr[x]=  arr[x]*-1;
        }
         
        }
        
        for(int numeros: arr){
            System.out.println(numeros);
        }
        
    }
}
