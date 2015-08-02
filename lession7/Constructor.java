/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession7;

/**
 *
 * @author Livs
 */
public class Constructor {
       public String description;
    public char colorCode;
     public double price;
 
     //Constructor
     public Constructor(){
 	 description = "--description required--";
	 colorCode = 'U';
	 price = 0.00;
   }
     
     public static void main(String[] args) {
        new Constructor();
    }

}
