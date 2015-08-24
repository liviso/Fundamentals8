
package lession13.interfarcesEjemplo3;

import java.lang.reflect.Field;

public interface InformacionObjeto {
    default public void imprimirPropiedadesObjeto(){
        Field [] campos= this.getClass().getDeclaredFields();
        for(int i=0; i<campos.length;i++){
            System.out.println(campos[i].getName());
        }
}
}

/*

Este método se apoya en el API de reflection para acceder a todas las propiedades que un objeto tiene e imprimirlas por la consola.
*/
