/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Hola jahazilito");
        System.out.println("Introduce tu primer numero: ");
        num1 = input.nextInt();
        System.out.println("Introduce tu segundo numero: ");
         num2 = input.nextInt();
         System.out.println("Introduce tu tercer numero: ");
          num3 = input.nextInt();
          
          if(num1>num2 && num1> num3){
              System.out.println("El numero mayor es: " + num1);}
          else if(num2>num1 && num2> num3 ){
              System.out.println("El numero mayor es: " + num2);}
          else{System.out.println("El numero mayor es: " + num3);
          
        
         
          }
          
    }
    
}
