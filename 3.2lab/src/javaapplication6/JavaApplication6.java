/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author lende
 */
public class JavaApplication6 {
 public static void main(String[] args){  
    int c=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0)c++;
        }  
        int[] Mas = new int[c];
        for(int i=1,d=0;i<=99;i++){
                if(i%2!=0){
                    Mas[d]=i;
                    System.out.print(Mas[d]+" ");
                    d++;
                }
        }
        System.out.println(" ");
        for(int i=Mas.length-1;i>=0;i--){
            System.out.println(Mas[i]);
        }
    }
} 
  
