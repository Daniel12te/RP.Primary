import java.util.Scanner;

public class Operaciones {

    static String nombre = "";
    static int cantidad = 0;
    static double precio = 0.0;
    static boolean hayProducto = false;


    public static void registrar(Scanner sc) {
    nombre = Validador.leerTexto(sc,"nombre del pro0ducto");
    cantidad = Validador.leerEntero(sc,"cantidad del producto");
    precio = Validador.leerDecimal(sc,"precio del producto");
    hayProducto = true;
    System.out.println("Producto registrado correctamente");
    }

    public static void ver(){
    if(!hayProducto){
        System.out.println("aun no hay ningun producto registrado");
        return;
    } 
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
    }
    

    public static void actualizarCantidad(Scanner sc){
        if(!hayProducto){
            System.out.println("aun no hay ningun producto registrado");
            return;
        } 
        cantidad = Validador.leerEntero(sc,"cantidad del producto");
        System.out.println("Cantidad actualizada correctamente");
        
    }

    public static void verValorTotal(){
        if(!hayProducto){
            System.out.println("aun no hay ningun producto registrado");
            return;
        } 
        double Total = cantidad * precio;
        System.out.println("Valor total del inventario: " + Total);
    }


    
}

