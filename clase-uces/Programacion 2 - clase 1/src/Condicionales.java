import java.util.Scanner;

public class Condicionales {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Tería 
        //Estructura IF
        int i = 11;
        if (i>10) {
            System.out.println(i);
        }
        //Ejercicio 3: Pedir 2 nums e indicar cual es el mayor - Estructura IF
        System.out.println("A continuación ingrese 2 número enteros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1>num2) {
            System.out.println("El número mayor es el primero: "+num1);
        } if (num2>num1) {
            System.out.println("El número mayor es el segundo: "+num2);
        } else {
            System.out.println("Los número ingresados son iguales");
        }



        //Teoría
        //Estructura switch-case
        int x = 11;
        switch (x) {
            case 1:
                System.out.println("Es uno");
                break;
            case 2:
                System.out.println("Es uno");
            default:
                System.out.println("No existe el case 11 - i=11");
                break;
        }
        //Ejercicio 4: Realizar menú de usuario 1.Compras, 2.Ventas, 3.Informes
        System.out.println("Ingrese su opción");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                System.out.println("1.Compras");
                break;
            case 2:
                System.out.println("2.Ventas");
                break;
            case 3:
                System.out.println("3.Informes");
                break;        
            default:
                System.out.println("Opción no válilda");
                break;
        }

        scanner.close();
    }
}
