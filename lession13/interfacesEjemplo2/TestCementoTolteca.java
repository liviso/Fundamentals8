
package lession13.interfacesEjemplo2;

public class TestCementoTolteca {
    public static void main(String[] args) {
        
       // ProductoraCemento pc= new ProductoraCemento();
        
        
        CalVentas tolteca= new ProductoraCemento("Productora Tolteca", 345, 200, 100);
        tolteca.imprimirReporteArticulo();
        tolteca.imprimirVigencia();
        
       
        
        if(tolteca instanceof ProductoraCemento){
             ((ProductoraCemento)tolteca).costoTransporte();
        }
    }
}
