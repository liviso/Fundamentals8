
package lession5.arrays;

/**
 *
 * @author Livs
 */
public class ArrayIrregular {
    public static void main(String args []){
        
        String familia[][]= new String[2][];
        familia[0]=new String[2];
        familia[1]=new String[3];
     
        familia[0][0]="Martha";
        familia[0][1]="Mauricio";
        
        familia[1][0]="Miguel";
        familia[1][1]="Bibiana";
        familia[1][2]="Marisol";
        
       for(int x=0; x<familia.length; x++){
           for(int y=0; y<familia[x].length; y++) {
               System.out.println("Mis padres: "+familia[x][y]);
           }
       }
    
       System.out.println("Utilizando for-each");
       for(String fam[]:familia){
           for(String myfam:fam){
           System.err.println(myfam);
           }
       }
        
    }
}








