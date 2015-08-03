package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa un nùmero");
        
        int a=Integer.parseInt(entrada.readLine());
        int b=Integer.parseInt(entrada.readLine());
        int c=Integer.parseInt(entrada.readLine());
        
        if(a>b && b>c){
            System.out.println(a+ " "+b+" "+c +" ");
        }
         if(b>c && c>a){
            System.out.println(b+ " "+c+" "+a +" ");
        }
        if(c>a && a>b){
            System.out.println(c+ " "+a+" "+b +" ");           
        }  
        if(a>c && c>b){
            System.out.println(a+ " "+c+" "+b +" ");
        }
        if(b>a && a>c){
            System.out.println(b+ " "+a+" "+c +" ");
        }
         if(c>b && b>a){
            System.out.println(c+ " "+b+" "+a +" ");
        }
        
	}

    }