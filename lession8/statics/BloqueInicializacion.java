
package lession8.statics;


public class BloqueInicializacion {
    double valPI=Math.PI;
    double radio=5.3;   
    
    {
        System.out.println("Curso Practico");
    }
    
    public void calculoArea(){
        double area=valPI*Math.pow(radio,2);       
        System.out.println("Area del circulo: "+area);
    }
    
    public static void main(String[] args) {
        BloqueInicializacion bloque = new BloqueInicializacion();
        bloque.calculoArea();
    }
}
