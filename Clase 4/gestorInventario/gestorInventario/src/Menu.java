import java.util.Scanner;



public class Menu {

    public static void mostrar() {
        System.out.println("Gestor de Inventario");
        System.out.println("1. Registrar producto");
        System.out.println("2. Ver producto");
        System.out.println("3. Actualizar cantidad");
        System.out.println("4. Ver valor total t0tal del inventario");
        System.out.println("5. Salir");
    }
    public static int leerOpcion(Scanner sc) {
        return Validador.leerEntero(sc, "Ingrese una opción (1-5):");
    }

}
