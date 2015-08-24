package tarea4;

import util.Entrada;

public class Ejercicio3 {

    public void mostrarEscalera() {
        System.out.println("Ingresa un número: ");
        int numero = Entrada.entero();
        System.out.println("Escalera de numeros:");
        for (int x = 0; x < numero; x++) {
            for (int y = 0; y < x + 1; y++) {
                System.out.print(y + 1);
            }
            System.out.println("");
        }
    }

    public void mostrarAsteriscos() {
        System.out.println("Ingresa un número: ");
        int numero = Entrada.entero();
        System.out.println("Escalera de asteriscos:");
        for (int x = 0; x < numero; x++) {
            for (int y = 0; y < (x + 1); y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void mostrarSueldos() {
        double suma = 0;
        int cantidad = 0;
        for (int x = 0; x < 5; x++) {
            System.out.println("Ingresa sueldo " + (x + 1) + ": ");
            double sueldo = Entrada.real();
            if (sueldo > 10000) {
                cantidad++;
            }
            suma += sueldo;
        }
        System.out.println("Total: " + suma + "\nMayores a 10000: " + cantidad);
    }

    public void introduceNegativo() {

        while (true) {
            int numero;
            System.out.println("Ingresas un número: ");
            numero = Entrada.entero();
            if (numero < 0) {
                break;
            } else {
                System.out.println("Cuadrado: " + numero * numero);
            }
        }

    }

    public static void main(String[] args) {
      //  new Ejercicio3().mostrarSueldos();
    }
}
