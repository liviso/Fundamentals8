
package lession13.interfarcesEjemplo3;


public class Persona implements InformacionObjeto{
    private String nombre;
    private String edad;
    
    public String getNombre(){
    return nombre;
   }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public String getEdad(){
        return edad;
    }
    
    public void setEdad(String edad){
        this.edad=edad;
    }
}
