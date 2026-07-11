import java.util.Scanner;


public class Validador {

        public static int leerEntero (Scanner sc, String mensaje){
            while (true){
                System.out.println(mensaje);
                if (sc.hasNextInt()){
                    int valor = sc.nextInt();
                    return valor;
                }else {
                    System.out.println("Error: Ingrese un número entero válido.");
                    sc.nextLine(); // Limpiar el buffer de entrada
                }
            }
        }    

        public static double leerDecimal(Scanner sc, String mensaje){
            while (true){
                System.out.println(mensaje);
                if (sc.hasNextDouble()){
                    double valor = sc.nextDouble();
                    return valor;
                }else {
                    System.out.println("Error: Ingrese un número decimal válido.");
                    sc.nextLine(); // Limpiar el buffer de entrada
                }
            }
        }


        public static String leerTexto(Scanner sc, String mensaje) {
            System.out.println(mensaje);
            return sc.nextLine();
        }


    
}

