import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        // scanner 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.println("Hola " + nombre + " bienvenido al programa ingresa cuantas personas van para la mesa: ");
        int personas = scanner.nextInt();
        System.out.println("Perfecto " + nombre + " para la mesa de " + personas  );

        double subtotal = 130000;
        boolean tieneCupon = true;

        boolean aplicaDescuento = subtotal > 100000 && tieneCupon;
        System.out.println("aplica el descuentp: " + aplicaDescuento);


        int entero = 10;
        double enteroDecimal = entero;
        System.out.println("el entero decimal es: " + enteroDecimal);


        double decimal = 10.5;
        int decimalEntero = (int) decimal;
    
    
        System.out.println("el decimal entero es: " + decimalEntero);
    }
}
