/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author lende
 */
public class NewClass {
     public void print(int n){
        System.out.println(n);
    }
     
     public void print(String s){
        System.out.println(s);
    }
     
     public static void main(String[] args) {
         NewClass ob = new NewClass();
         int n=1;
         String s= "Hello World";
         ob.print(n);
         ob.print(s);
     }
}