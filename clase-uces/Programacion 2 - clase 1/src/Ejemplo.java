import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu 1-Compras 2-Ventas 3-Stock 4-RRHH");
        int numeroElegido = scanner.nextInt();
        switch (numeroElegido) {
            case 1:
                System.out.println("Compras");
                break;
            case 2:
                System.out.println("Ventas");
                break;
            case 3:
                System.out.println("Stock");
                break;
            case 4:
                System.out.println("RRHH");
                break;
            default:
                System.out.println("Opcion no disponible");
                break;
        }
        scanner.close();
    }
    
}
