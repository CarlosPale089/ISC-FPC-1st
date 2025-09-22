/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_20_califas;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA_20_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificación;
        
       Scanner input = new Scanner (System.in);
        System.out.println("BIENVENIDO A TU BOLETA");
        System.out.println("Introduce tu calificación: ");
        calificación = input.nextInt();
        
        if(calificación>=90 && calificación <=100){
            System.out.println("Tienes una A");
            
            
        } else if(calificación>=80 && calificación<=89){
            System.out.println("Tienes una B");}
        
        
         else if(calificación>=70 && calificación<=79){
            System.out.println("Tienes una c");}
        
         else if(calificación>=60 && calificación<=69){
            System.out.println("Tienes una D");}
        
         else{System.out.println("Tienes una F");
            
        }
        
       
    }
    
}
