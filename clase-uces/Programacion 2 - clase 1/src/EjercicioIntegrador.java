import java.util.Scanner;

public class EjercicioIntegrador {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        eleccion(scanner);
        scanner.close();
    }

    public static void menu() {
        System.out.println("[1] Compras\n[2] Ventas\n[3] Informe de compras\n[4] Informe de ventas\n[0] Salir");
        System.out.print("Ingrese su opción --> ");
    }

    public static void informeCompras() {
        for (int i=100; i<=110; i++) {
            System.out.println(i);
        }
    }

    public static void informeVentas() {
        double i = 1000.0;
        while (i<=1010.0) {
            System.out.println(i);
            i++;
        }
    }

    public static void eleccion(Scanner scannner) {
        
        boolean bandera = true;

        while (bandera) {
            
            menu();
            int opcion = scannner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Menú compras");
                    break;

                case 2:
                    System.out.println("Menú Ventas");
                    break;

                case 3:
                    System.out.println("Informe de compras");
                    informeCompras();
                    break;

                case 4:
                    System.out.println("Informe de ventas");
                    informeVentas();
                    break;

                case 0:
                    System.out.println("SALIR");
                    bandera = false;
                    break;

                default:
                    System.out.println("Opción no válida\nVuelva a ingresar");
                    break;
            }
        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[h\033[2J");
        System.out.flush();
    }

}




