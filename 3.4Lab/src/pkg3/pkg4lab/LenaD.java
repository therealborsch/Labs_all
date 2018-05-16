/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg4lab;

/**
 *
 * @author lende
 */
public class LenaD {

   
    /*Создать двумерный массив из 8 строк по 5 столбцов в каждой 
    из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.*/
    
    public static void main(String[] args)  {
        //Создадим массив с заданными параметрами
        int[][] Mas = new int[8][5];
        //Заполним массив при помощи двух вложенных циклов, первым (внешним циклом заполним значения строк, вторым (внутренним) значения столбцов
        for(int i=0;i<Mas.length;i++){
            for(int j=0;j<Mas[i].length;j++){
                Mas[i][j]=(int)(Math.random()*90)+10;
                System.out.print(Mas[i][j]+" ");
            }
            System.out.println(" ");
        }
     }
    
}
