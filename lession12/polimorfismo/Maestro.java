package lession12.polimorfismo;

public class Maestro extends Persona {
    @Override
    public void trabajar(){
        System.out.println("Enseña a los alumnos");
        }
    
    @Override
    public void estudiarEspecializacion(){
        System.out.println("Maestria en educaci�n");
        }
    
    @Override
    public void generaHabilidades(){
        System.out.println("Enseñar");
        }
}
