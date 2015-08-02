//Pedir tres números y mostrarlos ordenados de mayor a menor.

package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Livs
 */
public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa nùmero 1");       
        int a=Integer.parseInt(entrada.readLine());
        
        System.out.println("Ingresa nùmero 2");       
        int b=Integer.parseInt(entrada.readLine());
        
        System.out.println("Ingresa nùmero 3");       
        int c=Integer.parseInt(entrada.readLine());
        
       if (a > b && b > c)
			System.out.println(a + ", " + b + ", " + c);
		else {
			if (a > c && c > b)
				System.out.println(a + ", " + c + ", " + b);
			else {
				if (b > a && a > c)
					System.out.println(b + ", " + a + ", " + c);
				else {
					if (b > c && c > a)
						System.out.println(b + ", " + c + ", " + a);
					else {
						if (c > a && a > b)
							System.out.println(c + ", " + a + ", " + b);
						else {
							if (c > b && b > a)
								System.out.println(c + ", " + b + ", " + a);
						}
					}
				}
			}
		}
	}

    }

