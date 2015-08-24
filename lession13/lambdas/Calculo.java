
package lession13.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Calculo {
    public static void main(String[] args) {
        List<Integer> numeros= new ArrayList<>();
        Random rnd= new Random();
        
        for(int i=0; i<100; i++){
            numeros.add(rnd.nextInt(100));
        }
        int counter=0;
        for(Integer i: numeros){
            if(i>=50 && i<70){
                counter++;
            }
        }
        
        rnd.ints(100,0,100).forEach(numeros::add);
        long b=numeros.stream().filter(i -> i>=50 && i<70).count();
        
        System.out.println("Resultado en Java 7: "+ counter);
        System.out.println("Resultad en Java 8: "+ b);
    }
}
