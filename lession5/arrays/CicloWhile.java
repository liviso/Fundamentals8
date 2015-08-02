
//Programa que calcula la suma de manera inversa 100, 98, 96 ....

package lession5.arrays;

public class CicloWhile {
    public static void main (String args []){
        int x=100;
        int suma=0;
        while(x>=1){
            suma+=x;
            x=x-2;
        }
        System.out.println("La suma total es: "+suma);
    }
}
