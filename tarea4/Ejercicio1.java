package tarea4;

import util.Entrada;

class CicloWhile {

    public void sumaInversa() {
        int x = 100;
        int suma = 0;
        while (x >= 1) {
            suma += x;
            x = x - 2;
        }
        System.out.println("Suma Total: " + suma);
    }

    public void obtenerPromedio() {
        System.out.println("Ingresa número de Alumnos: ");
        int noAlumnos = Entrada.entero();
        int x = 0;
        double suma = 0;
        while (x < noAlumnos) {
            System.out.println("Calificación " + (x + 1) + ": ");
            double cal = Entrada.real();
            suma += cal;
            x++;
        }
        System.out.println("Promedio: " + suma / noAlumnos);
    }

    public void cantidadNumeros() {
        int x = 0, pos = 0, neg = 0, neu = 0;

        while (x < 5) {
            System.out.println("Ingresa número " + (x + 1) + ": ");
            double numero = Entrada.real();
            if (numero > 0) {
                pos++;
            }
            if (numero < 0) {
                neg++;
            }
            if (numero == 0) {
                neu++;
            }
            x++;
        }
        System.out.println("Positivos: " + pos + "\nNegativos: " + neg + "\nNeutros: " + neu);
    }
}

class CicloDoWhile {

    public void sumaInversa() {
        int x = 100;
        int suma = 0;
        do {
            suma += x;
            x = x - 2;
        } while (x >= 1);
        System.out.println("Suma Total: " + suma);
    }

    public void obtenerPromedio() {
        int x = 0;
        int suma = 0;
        System.out.println("Ingresa número de Alumnos: ");
        int noAlumnos = Entrada.entero();
        do {

            System.out.println("Calificacion " + (x + 1) + ": ");
            double cal = Entrada.real();
            suma += cal;
            x++;
        } while (x < noAlumnos);
        System.out.println("Promedio: " + suma / noAlumnos);
    }

    public void cantidadNumeros() {

        int x = 0, pos = 0, neg = 0, neu = 0;
        do {
            System.out.println("Ingresa número " + (x + 1) + ": ");
            double numero = Entrada.real();
            if (numero > 0) {
                pos++;
            }
            if (numero < 0) {
                neg++;
            }
            if (numero == 0) {
                neu++;
            }
            x++;
        } while (x < 5);
        System.out.println("Positivos: " + pos + "\nNegativos: " + neg + "\nNeutros: " + neu);
    }
}

class CicloFor {

    public void sumaInversa() {
        int suma = 0;

        for (int x = 100; x >= 1; x = x - 2) {
            suma += x;
        }
        System.out.println("Suma Total: " + suma);
    }

    public void obtenerPromedio() {
        int suma = 0;
        System.out.println("Ingresa número de Alumnos: ");
        int noAlumnos = Entrada.entero();
        for (int x = 0; x < noAlumnos; x++) {
            System.out.println("Calificacion " + (x + 1) + ": ");
            double cal = Entrada.real();
            suma += cal;
        }
        System.out.println("Promedio Total: " + suma / noAlumnos);
    }

    public void cantidadNumeros() {
        int pos = 0, neg = 0, neu = 0;
        for (int x = 0; x < 5; x++) {
            System.out.println("Ingresa número " + (x + 1) + ": ");
            double numero = Entrada.real();
            if (numero > 0) {
                pos++;
            }
            if (numero < 0) {
                neg++;
            }
            if (numero == 0) {
                neu++;
            }
            System.out.println("Positivos: " + pos + "\nNegativos: " + neg + "\nNeutros: " + neu);
        }
    }
}

public class Ejercicio1 {

    public static void main(String[] args) {
//        new CicloWhile().cantidadNumeros();
//        new CicloDoWhile().cantidadNumeros();
//        new CicloFor().cantidadNumeros();
    }
}
