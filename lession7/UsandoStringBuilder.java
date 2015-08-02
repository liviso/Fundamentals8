
package lession7;

public class UsandoStringBuilder {
    
    public static void main(String[] args) {
        //Obtengo el milisegundo actual
        long hi=System.currentTimeMillis();
        
        //Instancio un StringBuilder
        StringBuilder sb= new StringBuilder();
        
        //Concatenar ncaracteres
        int n=10000;
        
        char c;
        for(int i=0; i<n; i++){
            //obtengo caracteres entre 'A' y 'Z'
            c=(char) ('A'+i%('Z'-'A'+1));
            //concaneno el caracter en el StringBuilder
            sb.append(c);
        }
        //obtengo el milisegundo actual
        long hf=System.currentTimeMillis();
        
        //muestro la cadena resultante
        System.out.println(sb.toString());
        
        //muestro la cantidad de milisegundos insumidos
        System.out.println((hf-hi)+" milisegundos");
    }
}
