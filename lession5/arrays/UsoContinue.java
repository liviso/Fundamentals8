
package lession5.arrays;
public class UsoContinue {

    public static void main (String args []){
        for(int i=1; i<5; i++){
            if(i==2){
               // break;
                continue;
            }
            System.out.println("i= "+i);
        }
    }
}
