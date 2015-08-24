package lession13.interfacesEjemplo1;


public class DescuentoTienda implements TipoDescuento {

    @Override
    public double importeDescontar(Compra c) {
        double descuento;
        if (c.getImporte() > 0 && c.getImporte() < 100) {
            descuento = 10;
        } else {
            descuento = 20;
        }
        return c.getImporte() * descuento / 100;
    }

    
}
