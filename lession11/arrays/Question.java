
package lession11.arrays;

public class Question {
    
    public static float average(int[] values){
        float result=0;
        for(int i=1; i<values.length;i++)
            result +=values[i];
        return (result/values.length);
        
        
    }
    public static void main(String[] args) {
        int []nums={100,200,300};
        System.out.println(nums.length);
        System.out.println(average(nums));
    }
    
}
