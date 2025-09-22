/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_24_juego_aguila_sol;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA_24_JUEGO_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String usuario;
        System.out.println("Aguila o sello? (1/0): ");
        usuario = input.nextLine();
        double moneda = Math.random();
        System.out.println("Resultado: " + moneda);
        
       
       if(moneda >= 0.5){
           System.out.println("La moneda cayo: AGUILA");}
       else{System.out.println("La moneda cayo: SELLO");}{
        
   
    }
        
    }
    
}
