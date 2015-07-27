
package lession5.arrays;

import java.util.Scanner;

/**
 *
 * @author Livs
 */
public class CicloDoWhile {
    
    public static void main (String [] args){
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa un número entero");
        int n=scanner.nextInt();
        
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
