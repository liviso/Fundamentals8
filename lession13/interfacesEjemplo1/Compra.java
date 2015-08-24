
package lession13.interfacesEjemplo1;

public class Compra {
    private double importe;
    
     public Compra(double importe) {
        super();
        this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
  
    public double descuento(TipoDescuento tipoDescuento){
        return importe-tipoDescuento.importeDescontar(this);
    }

}
