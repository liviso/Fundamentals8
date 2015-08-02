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
public class ConversionImplicita {
    public static void main(String[] args) {
int k=5, p;
short s=10;
char c='ñ';
float h;

p=c; //conversion char a int
h=k; //conversion int a float
k=s; //conversion short a int


        System.out.println(p+"\n"+h+"\n"+k);
    }
}
