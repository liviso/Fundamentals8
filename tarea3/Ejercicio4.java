package tarea3;

import util.Entrada;

public class Ejercicio4 {

    public static String procesarDia(String dia) {
        String ret = null;
        switch (dia) {
            case "Lunes":
                ret = "Comienza la semana";
                break;

            case "Martes":
            case "Miercoles":
            case "Jueves":
                ret = "Mitad de semana";
                break;

            case "Viernes":
                ret = "Finaliza la semana laboral";
                break;

            case "Sabado":
            case "Domingo":
                ret = "Fin de semana";

                break;

            default:
                throw new IllegalArgumentException("Dia incorrecto: " + dia);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println("Ingresa un dia de la semana: ");
        String dia=Entrada.cadena();
        System.out.println(procesarDia(dia));
    }
}
