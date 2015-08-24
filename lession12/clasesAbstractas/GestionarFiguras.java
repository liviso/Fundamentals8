package lession12.clasesAbstractas;

public class GestionarFiguras {

    public static void mostrar(Figura f) {
        System.out.println("El color de la figura es: " + f.getColor());
        System.out.println("El area de la Figura es: " + f.area());
    }

    public static void main(String[] args) {
        mostrar(new Triangulo(5, 7, "Verde"));

        mostrar(new Circulo(4, "azul"));

//        Triangulo t= new Triangulo(5,7,"Verde");
//        mostrar(t);
//        Figura fig= new Triangulo(5,7,"Verde");
//        mostrar(fig);
    }

}
