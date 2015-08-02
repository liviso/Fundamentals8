//Ingresar una fecha y que muestre el dia siguiente, considerando que todos los meses tienen 30 dias
package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Livs
 */
public class DiaSiguiente {
    public static void main(String[] args) throws IOException {
      
    BufferedReader Entrada = new BufferedReader(new InputStreamReader(System.in));        
        System.out.println("Ingresa el dia");        
        int dia=Integer.parseInt(Entrada.readLine());
        System.out.println("Ingresa el mes");        
        int mes=Integer.parseInt(Entrada.readLine());
        System.out.println("Ingresa el año");        
        int anio=Integer.parseInt(Entrada.readLine());
      
        if(dia>=30 | dia==0){
            dia=1;
        }else{
            dia++;
        }
        if(mes>=12 | mes==0){
            mes=1;
            anio++;
        }
        System.out.println(dia+"/"+mes+"/"+anio);
    }
}
