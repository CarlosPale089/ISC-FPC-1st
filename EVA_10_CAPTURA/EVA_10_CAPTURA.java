/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_10_captura;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double velocidad, tiempo, distancia;
        System.out.println("Indique la distancia: ");
        Scanner input = new Scanner(System.in);
        distancia = input.nextDouble();
        System.out.println("Indique el tiempo: ");
        tiempo = input.nextDouble();
        velocidad = distancia / tiempo;
        System.out.println("La velocidad es: " + velocidad + " m/s");
       
       
        
               
        
        
        
        
    }
    
}
