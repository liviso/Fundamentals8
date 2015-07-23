
package lession5.sentenciasControl;

import lession4.Entrada;

/**
 *
 * @author Livs
 */
public class DiaSiguiente {
    
    public void mostrarFecha(){
    int dia, mes, año;
		System.out.print("Introduzca día: ");
		dia = Entrada.entero();
		System.out.print("Introduzca mes: ");
		mes = Entrada.entero();
		System.out.print("Introduzca año: ");
		año = Entrada.entero();
		// suponemos que la fecha introducida es correcta
		// incrementamos el día
		dia++;
		// si el día supera 30, lo reiniciamos a 1 e incrementamos el mes
		if (dia >= 30) {
			dia = 1;
			mes++;
			// si el mes supera 12, lo reiniciamos a 1 e incrementamos el año
			if (mes >= 12) {
				mes = 1;
				año++;
			}
		}
		// habría que tener en cuenta que el año pasa del -1 al +1
		// en este código pasaríamos del año -1 al 0 (que nunca existió)
		// para corregirlo:
		if (año == 0)
			año = 1;
		System.out.println(dia + "/" + mes + "/" + año);
    }
    public static void main (String [] args){
    new DiaSiguiente().mostrarFecha();
    }
}
