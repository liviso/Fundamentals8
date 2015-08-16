package tarea2;

public class InvertirCadena {

    public static void main(String[] args) {
        String cadena = "¿Que lenguaje de programacion debo escoger?";
        String inversa = "";
        for (int x = cadena.length() - 1; x >= 0; x--) {
            inversa += cadena.charAt(x);
        }
        System.out.println(inversa);
    }
}
