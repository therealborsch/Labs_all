/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4lab;

/**
 *
 * @author lende
 */
public class LenaD{
    //Создадим метод, который будет возвращать случайное целое число из отрезка a-b, которые будт его параметрами
    public static int randomTest(int a,int b){
        if(a>b){
            int c=(int)(Math.random()*(a-b+1))+b;
            return c;
        }
        else {
            int c=(int)(Math.random()*(b-a+1))+a;
            return c;
        }
    }
    public static void main(String[] args){
        int[] Mas=new int[20];
        for (int i=0;i<Mas.length;i++){
            //Для заполнения значений элементов массива вызовем созданный нами метод. Также зададим методу фактические параметры (границы диапазона генерации).
            Mas[i]=randomTest(1, 9);
            System.out.print(Mas[i] +" ");
        }
    }
} 
