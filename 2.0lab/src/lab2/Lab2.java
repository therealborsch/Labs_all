/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.IOException;

/**
 *
 * @author lende
 */
public class Lab2 {
    
private static String TEXT = "I did laboratory work myself";

    /*
     *Это многострочный комментарий
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        System.out.println(TEXT);//Комментарий
        String s = "Ho-ho-ho!";
        printTextMoreTimes(s, 3);
    }
    public static void printTextMoreTimes(String s,int count)
    {
      for (int i=0;i<count;i++)
      {
          System.out.println(s);
      }
    }
}


