
package lession8.statics;

/**
 *
 * @author Livs
 */
public class AreaCirculo {
    
    static double valPI=Math.PI;
    static double radio=5.3;
    
    public static void calcularArea(){
        double area=valPI*Math.pow(radio, 2);
        System.out.println("Area del circulo: "+area);
    }
    public static void main(String[] args) {
        calcularArea();
    }
    
}
