import java.util.Scanner;

public class Ejercicio6 {
    
    /*Ejercicio 6

Ejercicio integrador: realizar un menú donde el usuario elija una opción entre,
compras, ventas, informe de compras, informe de ventas y la opción salir. Para
compras y ventas, solo imprimir “menú compras” o “menú ventas”. Para informe
de compras, imprimir: “Compra número: “ con un rango desde 100 hasta 110.
Para informe de ventas, “Venta con importe:” con un rango de 1000.0 hasta
1010.0. Para salir del sistema, se tendrá que seleccionar la opción salir.. */

    public static void menuVentas(){
        System.out.println("Se imprime el menú de ventas");
        System.out.println("Venta con importe:");
    }
    
    public static void menuCompras(){
        System.out.println("Se imprime el menú de compras");
        System.out.println("Compra número: ");
    }

    public static void menu(){
        System.out.println("MENÚ\n1-Compras\n2-Ventas\n3-Informe de compras\n4-Informe de ventas\n5-Salir");
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        menu();
        while(true) {
            int num = scanner.nextInt();
            if(num==5) break;
            switch(num) {
                case 1:
                    System.out.println("Compras");
                    break;
                case 2:
                    System.out.println("Ventas\n");
                    break;
                case 3:
                    System.out.println("Informes compras");
                    for(int j=100; j<=110; j++) {
                        System.out.println("Compra número "+j);
                    }
                    break;
                case 4:
                    System.out.println("Informes Ventas");
                    for(double v=1000.0; v<1100; v++) {
                        System.out.println("Venta con importe "+v);
                    }
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }
        }

        scanner.close();
        

    }
}
