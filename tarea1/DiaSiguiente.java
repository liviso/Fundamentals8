
package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DiaSiguiente {
    public static void main(String[] args) throws IOException {
      BufferedReader Entrada = new BufferedReader(new InputStreamReader(System.in));        
        System.out.println("Ingresa el dia");        
        int dia=Integer.parseInt(Entrada.readLine());
        System.out.println("Ingresa el mes");        
        int mes=Integer.parseInt(Entrada.readLine());
        System.out.println("Ingresa el año");        
        int anio=Integer.parseInt(Entrada.readLine());
        dia++; 
        if(dia>=30){
         dia=1;
         mes++;
        }
        if(mes>=12 ){
         mes=1;
         anio++;
        }
        if(anio==0)
            anio++;
        if(mes==0)
            mes++;
       
        System.out.println("\nFecha: "+dia+"/"+mes+"/"+anio);
 } 

    
}