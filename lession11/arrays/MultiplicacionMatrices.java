
package lession11.arrays;

import util.Entrada;

public class MultiplicacionMatrices {
    public static void main(String[] args) {
        
        double a [][]= new double [3][3];
        double b [][]= new double [3][3];
        double c [][]= new double [3][3];
        
        System.out.println("Ingresa la matriz A\n");
        
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length;j++){
                a[i][j]=Entrada.real();
            }             
        }
        
       System.out.println("Ingresa la matriz B\n");
       
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length;j++){
                b[i][j]=Entrada.real();
            }             
        }
        
//        Utilizando la declaraciòn implicita        
//        double a [][] = {{2,0,1},{3,0,0},{5,1,1}};
//        double b [][] = {{1,0,1},{1,2,1},{1,1,0}};
//        double c [][] = {{0,0,0},{0,0,0},{0,0,0}};
//

            for(int i=0; i<a.length; i++) {
            for(int j=0; j<b.length; j++){
                for(int n=0; n<c.length; n++){
                     c[i][j]+=a[i][n]*b[n][j];                
                }
                System.out.println(c[i][j]+" ");              
            }
            System.out.println("");
        }
       
    }
       
    }

