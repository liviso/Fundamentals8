
package tarea3;

import util.Entrada;

public class Ejercicio1 {
    public static void main(String[] args) {
         int num;
		 System.out.print("Introduzca un número entre 0 y 99.999: ");
		 num=Entrada.entero();
		 if(num<10)
		 System.out.println("tiene 1 cifra");
		  else{
			 if(num<100)
			 System.out.println("tiene 2 cifras");
				 else{
				 if(num<1000)
				 System.out.println("tiene 3 cifras");
				 else{
					 if(num<10000)
					 System.out.println("tiene 4 cifras");
					 else{
						 if(num<100000)
						 System.out.println("tiene 5 cifras");
					 } 
				 }
			 }
		 }
    }
}
