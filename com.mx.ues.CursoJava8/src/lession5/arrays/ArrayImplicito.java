
package lession5.arrays;
/**
 *
 * @author Livs
 */
public class ArrayImplicito {
    
    public static void main(String args[]){
        String telefonos[]={"556787678","345675675","34543456","345644345"};
       
        for(int x=0; x<telefonos.length; x++){
        System.out.println(telefonos[x]);
        }
        
        System.out.println("Usando for-each");
        for(String tel: telefonos){
        System.out.println(tel);
        }
    }
   
}
