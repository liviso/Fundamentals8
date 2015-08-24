
package lession13.interfacesEjemplo2;

public class ProductoraCemento implements CalVentas{
    private String nombre;
    private double precioVenta;
    private double costo;
    private double peso;

    public ProductoraCemento() {
    }

    public ProductoraCemento(String nombre,double precioVenta, double costo, double peso) {
        this.nombre=nombre;
        this.precioVenta = precioVenta;
        this.costo = costo;
        this.peso = peso;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public double calcGanancia() {
        return precioVenta-costo;
    }
    
    public void costoTransporte(){
        System.out.println("Costo de Transporte");
    }
    
}
