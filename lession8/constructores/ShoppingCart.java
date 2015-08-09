package lession8.constructores;

public class ShoppingCart {

    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        System.out.println("Shirt color: " + myShirt.codigoColor);
        changeShirtColor(myShirt, 'B');
        System.out.println("Shirt color: " + myShirt.codigoColor);
    }

    public static void changeShirtColor(Shirt theShirt, char color) {
        theShirt = new Shirt();
      // theShirt.codigoColor = color;     

    }
}
