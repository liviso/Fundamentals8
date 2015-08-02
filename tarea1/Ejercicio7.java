/*
    Calcular el promedio de calificaciones de un grupo de n alumnos en la materia de Programación. 
	- Se debe de pedir el número de alumnos que hay en el grupo 
	- Se ingresa la calificación correspondiente por cada alumno
	- Se obtiene el promedio del grupo en dicha materia y se muestra en pantalla
*/

package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void main(String[] args) throws IOException {
         BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
         
        System.out.println("Ingresa la cantidad de alumnos");
             
        int alumnos=Integer.parseInt(entrada.readLine());
        double cal;
        double suma=0, promedio=0;
        
        for (int i = 1; i <=alumnos; i++) {
            System.out.println("Ingresa calificación para el alumno "+i);
          cal=Double.parseDouble(entrada.readLine());
          suma=suma+cal;
            
        }
        promedio=suma/alumnos;
        System.out.println("promedio= "+promedio);
    }
}
