package lession8.constructores;

public class Persona {

    Persona() {
        System.out.println("Constructor vacio");
    }

    Persona(String nombre) {
        this(nombre.length());
        System.out.println("Constructor que recibe String");
    }

    Persona(int edad) {
        this();
        System.out.println("Constructor que recibe int");
    }

    void Persona() {
        System.out.println("No estoy seguro de lo que soy");
    }
}

class Test {

    public static void main(String[] args) {
        new Persona("Eduardo").Persona();
    }

}
