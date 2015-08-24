package lession13.interfacesEjemplo2;

public interface CalVentas {

    public double calcGanancia();

    public default void imprimirVigencia() {
        System.out.println("Enero 2016");
    }

    public default void imprimirReporteArticulo() {

        System.out.println("Ganancia: " + this.calcGanancia());
    }
    
   

}
