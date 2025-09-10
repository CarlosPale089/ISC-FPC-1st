/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_14_descuento;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double montoVenta, montoPagar;
    
      Scanner input = new Scanner (System.in);
      
      System.out.println("Introduce el monto de la compra:");
      
      montoVenta =  input.nextDouble();
      
      if(montoVenta> 1000){montoPagar = montoVenta * 0.15;
      System.out.println("Tu descuento es:  ");
      System.out.println(montoPagar);}
      else{System.out.println("No tienes descuento");}
   
      }
      
      
      }
      
      
      
    


