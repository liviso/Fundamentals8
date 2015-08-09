
package lession10.moreConditionals;

public class Debug {
    
    static String o="";
    
    public static void main(String[] args) {
       
        System.out.println("before");
        
        new Debug().question();
        
        System.out.println("after");
    }
    public void question(){
        double f=0;
        for(int x=2; x<7;x++){
            if(x==3)
                continue;
            if(x==5)
                break;
            o=o+x;
            f=f+x;
        }
        System.out.println(o);
        
    }
}
