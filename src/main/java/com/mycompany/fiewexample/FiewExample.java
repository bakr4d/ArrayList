/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fiewexample;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Lenovo
 */
public class FiewExample {

   public static void main (String []args) {
       
       ArrayList  <String> list=new ArrayList<String>();//by default the size is 10 >>()
   list.add("Ahmed");
   list.add("Mohamed");
   list.add("Omar");
   list.add("Ali");
   list.add("Khaled");
       System.out.println("The size of array is "+ list.size());
       System.out.println("Will show the values in array:"+list);
       System.out.println("هيطبع القيمه الي محدده"+list.get(3));
       
       list.add(0, "Abduallah");//Enter a variable other than this 
       list.set(3,"Eyad");
        list.remove(1);
        list.remove(2);

        
        System.out.println(list.size());
        System.out.println("طبعنا الاراي بعدماعدلنا عليها"+list);   
       
    }      
      
}
