package lession11.arrays;

import util.Entrada;

public class Selector {

    public static void main(String[] args) {
        int num;

        while (true) {
            System.out.print("Introduzca un número: ");
            num = Entrada.entero();
            if (num % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
            if (num == 0) {
                System.out.println("Fin del ciclo");
                break;
            }
        }

    }
}
