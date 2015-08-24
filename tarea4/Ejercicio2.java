package tarea4;

import util.Entrada;

public class Ejercicio2 {

    public void mostrarTablas() {
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                System.out.println(x + " * " + y + " = " + (x * y));
            }
            System.out.println("\n");
        }
      
    }
    
    

    public void mostrarInverso() {
        double numeros[] = new double[5];
        for (int x = 0; x < numeros.length; x++) {
            System.out.println("Ingresa numero " + (x + 1) + ": ");
            numeros[x] = Entrada.real();
        }
        for (int x = numeros.length - 1; x >= 0; x--) {
            System.out.println("Numero " + x + ": " + numeros[x]);
        }
    }

    public static void main(String[] args) {
        new Ejercicio2().mostrarTablas();
       // new Ejercicio2().mostrarInverso();

    }
}
