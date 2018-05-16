/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg3lab;
import java.io.BufferedReader;

import java.io.InputStreamReader;
/**
 *
 * @author lende
 */
public class LenaD

{

public static void main(String[] args) throws Exception
{
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String a1 = reader.readLine();
    String b1 = reader.readLine();
    int n = Integer.parseInt(a1);  //входная переменная 4
    int m = Integer.parseInt(b1);   //входная переменная 2
   String w = "";
   int c;
   int d;
   for (c = 0;c < n; c++)   {
       w = w + "8";
      if (c == n-1){
      for(d = 0; d < m; d++){
      System.out.println(w);
        }
      }
   }
}
}