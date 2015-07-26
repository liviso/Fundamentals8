
package lession5.sentenciasControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Fecha {
    
    public void mostrarFecha() throws IOException{
        int dia, mes, año;
		// para que una fecha sea correcta se tiene que cumplir
		// día en el rango 1..30
		// mes en el rango 1..12
		// año cualquiera distinto del 0
                BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
    
		System.out.print("Introduzca día: ");
		dia = Integer.parseInt(entrada.readLine());
		System.out.print("Introduzca mes: ");
		mes = Integer.parseInt(entrada.readLine());
		System.out.print("Introduzca año: ");
		año = Integer.parseInt(entrada.readLine());
		if (dia >= 1 && dia <= 30)
			if (mes >= 1 && mes <= 12)
				if (año != 0)
					System.out.println("Fecha correcta");
				else
					System.out.println("Año incorrecto");
			else
				System.out.println("Mes incorrecto");
		else
			System.out.println("Día incorrecto");
    }
    public static void main (String args[]) throws IOException{
    new Fecha().mostrarFecha();
    }
}
