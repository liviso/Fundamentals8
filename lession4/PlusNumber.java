
package lession4;

import java.util.Scanner;

public class PlusNumber {
    
    public void sumarNum(){
        
        Scanner scan= new Scanner(System.in);
        
       // Scanner scan= new Scanner("Hola Mundo");
       // scan.useDelimiter("\\ ");       
       // System.out.println(scan.next());
        
        System.out.println("Ingrese el primer numero");
        int number1=scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int number2=scan.nextInt();
        
        System.out.println("La suma es: "+ (number1+number2 ) );
        
    }

    
    public static void main(String[] args) {
       new PlusNumber().sumarNum();
    }
}
