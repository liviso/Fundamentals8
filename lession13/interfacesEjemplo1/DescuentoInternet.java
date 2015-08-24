
package lession13.interfacesEjemplo1;


public class DescuentoInternet implements TipoDescuento{

    @Override
    public double importeDescontar(Compra c) {
       double descuento;
       if(c.getImporte()>0 && c.getImporte()<200){
           descuento=20;
       }else{
           descuento=30;
       }
           return c.getImporte()*descuento/100;
    }
    
}
