/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_11_operaciones_logicas;

/**
 *
 * @author unipa
 */
public class EVA_11_OPERACIONES_LOGICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int radio = 5;
    boolean resu;
    //OPERACIOENES LOGICAS: COMPARACIONES
    //RESULTADOS: VERDADERO O FALSO
    resu = radio > 0;
    System.out.println("radio (5) > 0 -->");
    System.out.println(resu);
    
    resu = radio == 0;
    System.out.println("radio (5) == 0 -->");
    System.out.println(resu);
    
    resu = radio != 0;
    System.out.println("radio (5) != 0 -->");
    System.out.println(resu);
    }
    
}
