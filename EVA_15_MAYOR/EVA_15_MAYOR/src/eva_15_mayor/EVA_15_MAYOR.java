/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_15_mayor;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numeroMayor;
       int numeroMenor;
       Scanner input = new Scanner (System.in);
       System.out.println("Introduce el numeroMayor: ");
       numeroMayor = input.nextInt();
       System.out.println("Introduce el numeroMenor: ");
       numeroMenor = input.nextInt();
      
       
       if(numeroMayor > numeroMenor){System.out.println("Es mayor");
       System.out.println(numeroMayor);}
       else{System.out.println("No es mayor");}
       
    }
    
}
