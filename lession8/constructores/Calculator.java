
package lession8.constructores;


public class Calculator {
    
    public static int sum(int num1, int num2){
        System.out.println("Method One");
        return num1+num2;
    }
    public static float sum (float num1, float num2){
        System.out.println("Method Two");
        return num1+num2;
        
    }
    public static float sum (int num1, float num2){
        System.out.println("Method Three");
        return num1+num2;
    }
    
    public static void main(String[] args) {
        int tatalOne=Calculator.sum(2, 3);
        System.out.println("The total is "+tatalOne);
        
        float totalTwo= Calculator.sum(15.99F, 12.85F);
        System.out.println(totalTwo);
        
        float totalThree=Calculator.sum(2, 12.85F);
        System.out.println(totalThree);
        
    }
}
