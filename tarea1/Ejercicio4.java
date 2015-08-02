//Leer 10 números e imprimir solamente los números positivos.
package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Livs
 */
public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        
        int arr[] = new int[10];
        
        for(int x=0; x<arr.length; x++){
        System.out.println("Ingresa nùmero "+x);       
        arr[x]=Integer.parseInt(entrada.readLine());
                
        }
        
        System.out.println("Numeros positivos: ");
        for(int numeros:arr){
            if(numeros >0)
            System.out.println(numeros);
        }
            
    }
}
