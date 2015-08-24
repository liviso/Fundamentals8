package lession12.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        Persona persona;

        persona = new Ingeniero();
        persona.trabajar();
        persona.generaHabilidades();
        persona.estudiarEspecializacion();
       
        if (persona instanceof Ingeniero){
            System.out.println("Lo encontro");
            ((Ingeniero)persona).noLoEncuentra();
        }else{
            System.out.println("no lo encontro, no se puede castear");
            
        }
        
        
        persona = new Maestro();
        persona.trabajar();
        persona.generaHabilidades();
        persona.estudiarEspecializacion();
        
        
        String nombre="array";
        
        if( nombre instanceof String){
            System.out.println("Pertenece a la clase String");
        }
    }
}
