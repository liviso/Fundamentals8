
package lession12.herencia;

public class Clothing {
    private int itemID;
    private String desc;
    private char colorCode;
    private double price;
    
   // protected boolean accesorio;

    public Clothing() {

    }

    public Clothing(int itemID, String desc, char colorCode, double price) {
   //    this();
        this.itemID = itemID;
        this.desc = desc;
        this.colorCode = colorCode;
        this.price = price;
        
    }
    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("ID: "+getItemID());
        System.out.println("Precio: "+getPrice());
        System.out.println("color "+getColorCode());
    }
    
//    public void ponerMostrador(){
//        System.out.println("Se coloco en Mostrador");
//    }
    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return "Clothing{" + "itemID=" + itemID + ", desc=" + desc + ", colorCode=" + colorCode + ", price=" + price + '}';
//    }
    
}
