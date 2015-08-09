package lession8.constructores;

public class Shirt {

    public String descripcion;
    public char codigoColor;
    public double precio;

    public Shirt() {
        descripcion = "Playera para mujer";
        codigoColor = 'A';
        precio = 345.60;
        //   this.display();
    }

    public Shirt(String descripcion, char codigoColor, double precio) {
        this.descripcion = descripcion;
        this.codigoColor = codigoColor;
        this.precio = precio;
        this.display();

    }

    public void display() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Codigo de color: " + codigoColor);
        System.out.println("Precio: " + precio);
    }

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        System.out.println("---------------------------------");
        Shirt myshirt = new Shirt("Playera para hombre", 'B', 567.89);
    }
}
