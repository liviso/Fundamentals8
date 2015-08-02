//Leer 5 números e imprimir cuantos son positivos, cuantos negativos, y cuantos neutros.
package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        
         BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
         
        int numero;
        int pos=0, neg=0, neu=0;
        
        for(int x=1; x<=5; x++){
        System.out.println("Ingresa nùmero "+x);       
        numero=Integer.parseInt(entrada.readLine());
        
        if(numero>0){
        pos++;
        }
        else if(numero<0){
        neg++;
        }
        else{
        neu++;
        }
            
        }
        
        System.out.println("\nNumeros positivos: "+pos+"\nNumeros negativos: "+neg+"\nNumeros neutros: "+neu);
    }
}
