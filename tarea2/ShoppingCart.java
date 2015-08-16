
package tarea2;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName="Steve Smith";
        String firstName;
        int spaceIdx;
        
        spaceIdx=custName.indexOf(" ");
        firstName=custName.substring(0,spaceIdx);
        System.out.println(firstName);
        
        StringBuilder name= new StringBuilder(firstName);
        
        name.append(" Smith");
        
        System.out.println(name);
    }
}
