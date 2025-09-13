/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_19_antro;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA_19_ANTRO {

    final static String INE = "Si"; 

    public static void main(String[] args) {
        int edad;
        String ine;
        Scanner input = new Scanner(System.in);

        System.out.println("BIENVENIDO");
        System.out.println("Antro pueblita");
        System.out.println("Introduce tu edad: ");
        edad = input.nextInt();
        input.nextLine(); // Se usa para consumir el salto de línea

        if (edad >= 18) {
            System.out.println("Cuentas con tu INE (especifica Si o No):");
            ine = input.nextLine();
            if (ine.equalsIgnoreCase(INE)) { // Use equalsIgnoreCase para que no distinga entre mayúsculas y minúsculas
                System.out.println("¡Sí puedes pasar!");
            } else {
                System.out.println("No puedes pasar, no tienes INE.");
            }
        } else {
            System.out.println("No puedes pasar, eres menor.");
        }
    }
} 

