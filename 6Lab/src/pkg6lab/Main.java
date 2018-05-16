/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6lab;

include <stdio.h>
include <string.h>


public class Main { 
public static void main(String[] args) {

    char str[128]; //длина предложения
    char *words[15]; //кол-во слов
    char symbols[] = " !?,.";
    int length, min, i=1, count = 0;
 
    printf("String: ");
    gets(str);
    words[0] = strtok(str, symbols);
    min = strlen(words[0]);
    while(words[i]!=NULL)
    {
        words[++i] = strtok(NULL, symbols);
        if(words[i]!=NULL) length = strlen(words[i]);
        if(length < min)
        {
            min = length;
            count = i;
        }
    }
    printf("Short word is: %s, length = %d\n", words[count], min);
}
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
