/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fiewexample;

/**
 *
 * @author Lenovo
 */
public class FiewExample {

    static int add(int n1,int n2){
        int n3 = n1+n2;
        return n3;
    }

    public static void main(String[] args) {
        Math n1=new Math(9);
        Math n2=new Math(5);
        Math n3=Math.add(n1, n2);
        System.out.println("The sum of 2 function by the second way :" + n3.val);
   // or 
   Math n5=new Math(3);
   Math n6=new Math(32);
   Math n7=n6.add(n5);
   System.out.println("The sum of 2 function by the Third way:"+n7.val);;
   


      
 }
}
