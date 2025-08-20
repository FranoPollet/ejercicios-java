package Ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

    static void menu(){
        System.out.println("[1] Depositar");
        System.out.println("[2] Retirar");
        System.out.println("[3] Ver Saldo");
        System.out.println("[0] Salir");
    }

    static void ingresarOpcion(CuentaBancaria cuenta, Scanner scanner){
        int op;
        while (true){
            menu();
            System.out.print("Ingrese su opción --> ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.print("\nIngrese su deposito --> $ ");
                    int desposito = scanner.nextInt();
                    cuenta.depositar(desposito);
                    break;
                case 2:
                    System.out.print("\nIngrese su retiro --> $ ");
                    int retirar = scanner.nextInt();
                    cuenta.retirar(retirar);
                    break;
                case 3:
                    cuenta.mostrarSaldo();
                    break;
                case 0:
                    System.out.println("\nFinalizando...");
                    return;            
                default:
                    break;
            }
        }
        
    }
    
    //! BANCO SIMPLE: CuentaBancaria con núm de cuenta, titular, y saldo; depositar(), retirar(), mostrarSaldo().
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numeroDeCuenta=44895308;
        cuenta1.titular="Francisco Pollet";
        ingresarOpcion(cuenta1, scanner);

        scanner.close();
    }
}
