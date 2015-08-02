package lession5.arrays;

import java.util.Scanner;

/**
 *
 * @author Livs
 */
public class DiasSemana {
    
    public static void main (String []args){
        
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves",
                        "Viernes", "Sabado", "Domingo"};
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("\"Mi nombre es Olivia\" ");
        int num=scanner.nextInt();
        
        if(num <=dias.length){
            //Recordemos que los arrays se enumeran desde 0
            System.out.println(dias[num-1]);
        }
        else{
            System.out.println("Dia incorrecto");
        }
    }
}
