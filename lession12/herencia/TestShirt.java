
package lession12.herencia;

public class TestShirt {
    public static void main(String[] args) {
        //1
        Shirt shirt= new Shirt();
        shirt.setItemID(1);
        shirt.setDesc("Camisa de manga larga");
        shirt.setColorCode('B');
        shirt.setPrice(234.56);
        shirt.setFit('L');
        
        System.out.println("Creando la primer camisa: ");
        shirt.display();
        
        
        //2
//        Shirt shirt2= new Shirt(1, "Camisa 3/4", 'B', 345, 'L');
//        shirt2.display();
     
        
//        Clothing cloth = new Shirt();
//        cloth.display();// Se ejecuta el método de la clase Clothing
//        ((Shirt)cloth).getFit();
    }
}
