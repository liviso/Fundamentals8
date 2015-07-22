
package lession4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
    
    public void showStudent() throws IOException{
    BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingresa tu nombre");
        String nombre=bf.readLine();
        
        System.out.println("Ingresa tu edad");
        String edad=bf.readLine();
        int miEdad=Integer.parseInt(edad);
        
        System.out.println("Tu nombre es: "+nombre+"\n"+"Tu edad es: "+miEdad);
    }
    
    public static void main(String[] args) throws IOException {
        
        new Student().showStudent();
        
    }
}
