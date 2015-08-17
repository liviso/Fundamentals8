package tarea3;

import util.Entrada;

public class Ejercicio3 {

    public static void main(String[] args) {
        double nota;
        System.out.print("Introduzca una nota: ");
        nota = Entrada.entero();

        if (nota >= 0 && nota <= 6) {
            System.out.println("INSUFICIENTE");
        } else if (nota == 7) {
            System.out.println("BIEN");
        } else if (nota == 8) {
            System.out.println("NOTABLE");
        } else if (nota == 9 || nota == 10) {
            System.out.println("SOBRESALIENTE");
        }
    }
}
