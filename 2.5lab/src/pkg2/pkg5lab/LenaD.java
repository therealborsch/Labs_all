/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg5lab;
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
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int m=min(a, b);
    System.out.println(m);
}  
public static int min(int a, int b) {
    return (a<b)? a:b;
}  
}
    

