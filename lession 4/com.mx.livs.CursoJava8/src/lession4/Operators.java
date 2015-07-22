
package lession4;

public class Operators {
   int a=3, b=5, s;
   
   public void bothValue(){
        b=a++;//a y b valen 3
        System.out.println("Valor de b: "+b);//3
      
        s=++b* ++a; //b=4 y a=5
         System.out.println("Valor de s  "+s );//3
    }
   
    public void beforeValue(){     
        b=++a; // b=4 y a=4
        System.out.println("Valor de b: "+b);
        
        s=++b*a++;// b=5 y a=4
        System.out.println("Valor de s: "+s);
        
    }

    public static void main (String [] args){
        
        new Operators().bothValue();
        new Operators().beforeValue();
   
    }
}
