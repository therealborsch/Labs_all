/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg4lab;
/**
 *
 * @author lende
 */
/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/
public class LenaD {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
   public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String s = "8";
        for (int count = 0; count < 10; count++){
        System.out.println(s);
        s = s + 8;
    }
    }
    
}
