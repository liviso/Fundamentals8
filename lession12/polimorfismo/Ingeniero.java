package lession12.polimorfismo;

public class Ingeniero extends Persona {
     @Override
    public void trabajar(){
        System.out.println("Desarrollo de software");
        }
     @Override
    public void estudiarEspecializacion(){
        System.out.println("Java OCP");
        }
     @Override
    public void generaHabilidades(){
        System.out.println("Resolver problemas");
        }
    
    public void noLoEncuentra(){
        System.out.println("lo encontro");
    }
}
