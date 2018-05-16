/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg3lab;
import java.util.Random;//Библиотека для генерации случайных чисел
/**
 *
 * @author lende
 */
public class LenaD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b=0;
        int[] Mas = new int[15];
        for(int i=0;i<Mas.length;i++){
            Random rnd=new Random();
            Mas[i]=rnd.nextInt(10);
            System.out.print(Mas[i] +" ");
            if(Mas[i]>0&Mas[i]%2==0)b++;
        }
        System.out.println(" ");
        System.out.println("Чётных чисел в массиве "+b+" p.s LenaD ");
    }
}
