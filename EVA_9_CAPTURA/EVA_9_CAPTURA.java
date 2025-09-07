/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_9_captura;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        System.out.println("Introduce tu nombre completo:");
        //Captura de datos:
        Scanner input = new Scanner(System.in);
        nombre = input.nextLine();//CAPTURA EL TEXTO(nextLine)
        System.out.println("Introduce tu edad:");
        edad = input.nextInt();
        System.out.println("Captura de promedio de preparatoria");
        promedio = input.nextDouble();

        System.out.println("El nombre es: " + nombre);

        System.out.println("La edad es: " + edad);

        System.out.println("El promedio es: " + promedio);

    }

}
