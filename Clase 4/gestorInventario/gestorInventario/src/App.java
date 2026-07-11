import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            Menu.mostrar();
            opcion = Menu.leerOpcion(sc);
            switch (opcion) {
                case 1:
                    Operaciones.registrar(sc);
                    break;
                case 2:
                    Operaciones.ver();
                    break;
                case 3:
                    Operaciones.actualizarCantidad(sc);
                    break;
                case 4:
                    Operaciones.verValorTotal();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        sc.close();
    }
}
