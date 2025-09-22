/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_23_conversiones;

/**
 *
 * @author unipa
 */
public class EVA_23_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp;
        double tempDecimal;
        tempDecimal = 26.8;
        temp = (int)tempDecimal;
        System.out.println(temp);
        
        String cade, mensaje;
        mensaje = "La temperatura es ";
        cade = mensaje + temp;
        System.out.println(cade);
    }
    
}
