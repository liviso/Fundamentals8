
package lession7;

/**
 *
 * @author Livs
 */
public class UsandoStringBuilder2 {
    public static void main(String[] args) {
        long hi=System.currentTimeMillis();
        
        String sb="";
        
        int n=10000;
        
        char c;
        for(int i=0; i<n; i++){
            c=(char) ('A'+i%('A'-'Y'+1));
            //Concateno usando el operador +
            sb=sb+c;
        }
        long hf=System.currentTimeMillis();
        
        System.out.println(sb);
        
        System.out.println((hf-hi)+" milisegundos");
    }
}
