
package lession13.interfacesConcepto;

public class Compra {
    private double importe;
    private String tipo;

    public Compra() {
    }

    public Compra(double importe, String tipo) {
        this.importe = importe;
        this.tipo = tipo;
    }
    
    public double getImporte(){
        return importe;
    }
    
    public void setImporte(double importe){
        this.importe=importe;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public double descuento(){
        double descuento;
        descuento=10;
        
        if(tipo.equals("tienda")){
            if(importe>0 && importe <100){
                descuento=10;
            }
        else{
        descuento=20;
        }
            
    }else{
        if(importe >0 && importe <100){
            descuento=20;
        }else{
            descuento=30;
        }
        }
        return importe-importe * descuento/100;
            
    }
}

/*
Para solventar este problema podemos reubicar la lógica de negocio de la aplicación
diseñando un interface que sirva como punto de extensibilidad para la funcionalidad del
descuento.
*/
