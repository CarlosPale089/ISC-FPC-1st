/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_18_acceso;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA_18_ACCESO {
    
final static String USUARIO = "Carlos";
 final static String PWD = "1234";
    
    public static void main(String[] args) {
        String usuario, contra;
        
        Scanner input = new Scanner (System.in);
         System.out.println("BIENVENIDO");
          System.out.println("Sistema de venta de restaurante");
        System.out.println("Introduce tu usuario: ");
       usuario = input.nextLine();
         System.out.println("Introduce tu contraseña: ");
         contra=  input.nextLine();
         
         if(usuario.equals(USUARIO) ){
              System.out.println("USUARIO CORRECTO");}
         if(contra.equals(PWD)){System.out.println("ACCESO CORRECTO");}
         else{ System.out.println("ACCESO DENEGADO");
         }
          
           
            
                 
                 
         
         
        
        
        
        
        
    }
    
}
