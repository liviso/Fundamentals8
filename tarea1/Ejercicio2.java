
//Pedir un número e indicar si es positivo o negativo.

package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {   
            
    public static void main(String[] args) throws IOException {
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa un nùmero");
        
        int num1=Integer.parseInt(entrada.readLine());
        
        if(num1>0)
            System.out.println("El nùmero es positivo");    
        else if(num1<0)
            System.out.println("El nùmero es negativo");
        else
            System.err.println("El numero es neutro");
    }
}
