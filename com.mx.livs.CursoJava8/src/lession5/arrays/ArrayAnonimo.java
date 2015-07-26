
package lession5.arrays;

/**
 *
 * @author Livs
 */
public class ArrayAnonimo {
    
     public void imprimirArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
     
  public static void main (String args[]){  
    new ArrayAnonimo().imprimirArray(new int[]{4,5,6,7,8,9});
    
    }
}
