
package lession5.arrays;

/**
 *
 * @author Livs
 */
public class ArrayExplicito {
    
    public static void main (String []args){
         double d[]= new double[5];
         double promedio=0.0;
         for(int i=0; i<d.length;i++){
             d[i]=i;
              promedio=promedio+d[i];
         }
         System.out.println(promedio/d.length);
    }
}
