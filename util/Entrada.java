package util;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Entrada {

    static String incializar() {
        String buzon = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try {
            buzon = teclado.readLine();
        } catch (IOException ex) {
            System.out.println("Entrada Incorrecta");
        }
        return buzon;
    }

    public static int entero() {
        int valor = Integer.parseInt(incializar());
        return valor;
    }

    public static double real() {
        double valor = Double.parseDouble(incializar());
        return valor;
    }

    public static String cadena() {
        String valor = incializar();
        return valor;
    }

    public static char caracter() {
        String valor = (incializar());
        return valor.charAt(0);
    }

}
