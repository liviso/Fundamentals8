
//Pedir dos números y decir cuál es el mayor o si son iguales.
package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio1 {
    
    public void numMayor() throws IOException{
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa un nùmero: ");
        int num1=Integer.parseInt(entrada.readLine());
        
         System.out.println("Ingresa otro nùmero: ");
        int num2=Integer.parseInt(entrada.readLine());
        
        if(num1>num2){
            System.out.println(num1+ " es mayor "+ num1+" es menor");
    }
        else if(num2>num1){
            System.err.println(num2+" es mayor "+num1+ " es menor");
        }
        else{
            System.out.println("Los numeros son iguales");
        }
    }
    
    public static void main(String args[]) throws IOException{
        new Ejercicio1().numMayor();
    }
}
