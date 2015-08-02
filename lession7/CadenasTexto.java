
package lession7;

/**
 *
 * @author Livs
 */
public class CadenasTexto {
    
    public void metodoEquals(){
        String s1="Hola Mundo";
        String s2=new String (s1);
        
        System.out.println(s1+"=="+s2+" "+(s1==s2) );
        
        System.out.println(s1+" equals "+s2+" "+s1.equals(s2));
    }
    
    public void metodoCharAt(){
        String s="Texto de prueba";
        char c='e';
        int count=0;
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println("La letra "+c+" aparece "+count+ " veces");
    }
    
    public void metodoSubString(){
        String s="Texto de prueba";
        System.out.println(s.substring(9,15));
    }
    
    public void metodoContains(){
        String texto="Primero resuelves el problema, después escribes el código";
        String cadena="Primero";
        
        if(texto.contains(cadena)){
            System.out.println("Se encuentra la cadena ");
        }
        else{
             System.out.println("No se encuentra la cadena");
        }
    }
    
    public void metodoReplace(){
        String numero="4,56";
        String nuevoNum=numero.replace(',', '.');
        System.out.println(nuevoNum);
        
        String frase="alumna del 6to semestre, alumna muy competente";
        String nvaFrase=frase.replaceAll("alumna", "alumno");
        System.out.println(nvaFrase);
    }
    
    public void convMinusculas(){
        String frase="Conoce los beneficios de Java 8";
        String fraseM = frase.toUpperCase();
        System.out.println(fraseM);
    }
    
    public void convMayusculas(){
        String frase="¿QUE ES LO NUEVO DE JAVA 8?";
        String fraseM = frase.toLowerCase();
        System.out.println(fraseM);
    }
    
    public void metodoSplit(){
        String dias="Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo";
        String [] cads=dias.split(",");
        
        for(int x=0; x<cads.length; x++){
            System.out.println(cads[x]);
        }
        
        for (String diasSemana:cads){
            System.out.println(diasSemana);
        }
    }
    
    public static void main (String [] args){
       new CadenasTexto().metodoSplit();
       
    }
}
