/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fiewexample;

/**
 *
 * @author Lenovo
 */
public class Math {
    int val;
    
    public Math(){}//default Constructor;
    public Math(int val ){
        this.val=val;// for n1 =2
        //for n2=5
    }
   public static Math add(Math n1,Math n2){
        Math n3=new Math();
    n3.val=n1.val+n2.val;
   return n3;
   
    }
    public Math add(Math n6){
      Math n7=new Math();
    n7.val=this.val+n6.val;
   return n7;
    
}
}