package Tienda;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tienda obj = new Tienda("", 0);
        System.out.print(" __^__                                      __^__ \n"
                + "( ___ )------------------------------------( ___ )\n"
                + " | / |                                      | / | \n"
                + " | / |         M&S Gaming Products          | / |\n"
                + " |___|                                      |___|\n"
                + "(_____)------------------------------------(_____)\n");

        System.out.println("                ──▒▒▒▒▒▒───▄████▄ \n"
                + "                ─▒─▄▒─▄▒──███▄█▀\n"
                + "                ─▒▒▒▒▒▒▒─-████  █ █\n"
                + "                ─▒▒▒▒▒▒▒──█████▄\n"
                + "                ─▒─▒─▒─▒───▀████▀");

        System.out.println();
        System.out.print("==> Bienvenido a la tienda gamer M&S Gaming Products! <==\n"
                + "Introduzca su nombre porfavor: ");
        String nombreUsuario = entrada.nextLine().trim();
        System.out.println("Bienvenido " + nombreUsuario);

        System.out.print("De cuanto es su presupuesto inicial (Sin puntos ni comas, todo pegado): ");
        String monto = entrada.nextLine().trim();

        boolean x = obj.validarMonto(monto);

        while (x == false) {
            System.out.println("██╗\n"
                    + "██║\n"
                    + "██║\n"
                    + "╚═╝\n"
                    + "██╗\n"
                    + "╚═╝\n");
            System.out.print("Introduzca numeros correctos:");
            monto = entrada.nextLine().trim();
            x = obj.validarMonto(monto);
        }

        System.out.println();

        System.out.println();

        obj.setNombreUsuario(nombreUsuario);

        obj.setMonto(Long.parseLong(monto));
        obj.mostrarMenu();
    }
}
