// Calsular la siguiente suma
// 100+98+96+94. . . . . .

package lession5.arrays;

/**
 *
 * @author Livs
 */
public class CicloFor {
    
    public void sumaInversa(){
    int con=0;
    
        for(int x=100; x>=1; x=x+3){ x++; x++; x++;
            con=con+x;
        }
        
        System.out.println("Suma total: "+con);
    }
    public static void main (String args[]){
  //  new CicloFor().sumaInversa();
       int  x=0;
     //  x=x+3;
     //  x++; x++; x++;
       
       x=x++*3;
       
       System.out.println(x);
       
    }
}
