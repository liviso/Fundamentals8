
package tarea3;

public class Ejercicio6 {
    
    public void uno(){
        
        if(false){
            System.out.println("Dude, that was true");
        }else{
            System.out.println("Sorry Dude, it`s false");
        }
            
    }
    
    public void dos(){
        int x=5;
        String out= "There";
        
        if(x>1){
            out+= " are "+x+ " cookies";
        }
        else{
            out+=" is one cookie in the jar.";
        }
        System.out.println(out);
    }
    
    public static void main(String[] args) {
        new Ejercicio6().dos();
    }
}
