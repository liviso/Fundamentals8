
package lession13.claseObject;

public class Coordenada{
    private double x;
    private double y;

    public Coordenada() {
    }

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(double x){
        this.x=x;
    }
    
    public double getX(){
    return x;
    }
    
    public void setY(double y){
    this.y=y;
    }
    
    public double getY(){
    return y;
    }
    
    @Override
    public String toString(){
    return "valor de x: "+x+" valor de y: "+y;
    }
}
