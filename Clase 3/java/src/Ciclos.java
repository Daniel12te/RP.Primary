import java.util.Scanner;

public class Ciclos {


    public static void main(String[] args) {
        int mesasPorLimpiar = 3;
        while (mesasPorLimpiar > 0) {
            System.out.println("mesas por limpiar: " + mesasPorLimpiar);
            mesasPorLimpiar--;
        }
        System.out.println("ya no hay mesas por limpiar todas las mesas estan limpias");

        for (int i = 0; i < 5; i++) {
            System.out.println("plato #" + i + " impreso en el recibo");
        }

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("1 continuar 2 salir ");
            System.out.println("elije una opcion: ");
            opcion = sc.nextInt();
        } while (opcion != 2);
        System.out.println("saliendo del programa");

    }
}
