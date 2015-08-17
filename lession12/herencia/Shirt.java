
package lession12.herencia;

public class Shirt extends Clothing{
    private char fit;

    public Shirt() {

    }


    public Shirt(int itemID, String desc, char colorCode, double price, char fit) {
    super(itemID, desc, colorCode, price);
        //this();
        this.fit=fit;
    }
    
       @Override
     public void display(){
        System.out.println("* Item description: "+getDesc());
        System.out.println("* ID: "+getItemID());
        System.out.println("* Precio: "+getPrice());
        System.out.println("* Color: "+getColorCode());
        System.out.println("* Fit: "+getFit());
        //System.out.println("* Accesorio: "+(accesorio=true));
    }
    
    public char getFit(){
        return fit;
    }
    
    public void setFit(char fit){
        this.fit=fit;
    }
   
    
}
