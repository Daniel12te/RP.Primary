public class Condicionales {

        public static void main(String[] args) {
            double cuenta = 150000;
        /* 
        if (cuenta > 100000) {
            System.out.println("aplica descuento");
        } 
        
        }
    
*/
    if (cuenta > 200000) {
            System.out.println("aplica descuento vip(15%)");
        } else if (cuenta > 100000) {
            System.out.println("aplica descuento normal (10%)");
        } else {
            System.out.println("no aplica descuento");
        }
    

    int numero = 1;

        switch (numero) {
            case 1:
                System.out.println("nuevo pedido");
                break;
            case 2:
                System.out.println("cancelar pedido");
                break;
            default:
                System.out.println("opcion invalida ");
        }

}

}