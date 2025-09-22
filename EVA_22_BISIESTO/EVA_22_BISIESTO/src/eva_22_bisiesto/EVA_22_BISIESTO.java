package eva_22_bisiesto;

import java.util.Scanner;

public class EVA_22_BISIESTO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int año, resi4, resi100, resi400;
        System.out.println("Año a verificar: ");
        año = input.nextInt();
        resi4 = año % 4;
        resi100 = año % 100;
        resi400 = año % 400;

        if (resi4 == 0 && resi100 != 0) {
            System.out.println("Es bisiesto");
        } else if (resi400
                == 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }

    }

}
