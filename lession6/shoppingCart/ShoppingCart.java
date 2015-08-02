
package lession6.shoppingCart;

public class ShoppingCart {
 
    public static void main(String[] args) {
       Articulo art1, art2;
       
       art1=new Articulo();
       art2=new Articulo();
       
       art1.articuloID=1;
       art1.descripcion="Camisa";
       art1.cantidad=1;
       art1.precio=234.50;
       
       art2.articuloID=2;
       art2.descripcion="jeans";
       art2.precio=350;
       art2.cantidad=1;
       
      System.out.println(art1);
        System.out.println(art2);
       
    }
}

