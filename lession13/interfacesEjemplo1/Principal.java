
package lession13.interfacesEjemplo1;

public class Principal {
    public static void main(String[] args) {
        Compra c = new Compra(1000);
        System.out.println(c.descuento(new DescuentoTienda()));
    }
}
