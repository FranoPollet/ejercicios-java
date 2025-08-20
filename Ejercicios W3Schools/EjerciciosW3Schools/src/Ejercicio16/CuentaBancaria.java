package Ejercicio16;

public class CuentaBancaria {
    
    int numeroDeCuenta;
    String titular;
    double saldo;

    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("\nSe han despositado $"+deposito+" a su cuenta con éxito!\n");
    }

    public void retirar(double retiro){
        if ((saldo-retiro) < 0){
            System.out.println("\nERROR");
            System.out.println("El retiro supera su saldo. Realice un deposito primero (opción [1])\n");
        } else {
            saldo -= retiro;
            System.out.println("\nRetiro exitoso!");
            System.out.println("Se ha retirado la suma total de $"+retiro+"\n");
        }
    }

    public void mostrarSaldo(){
        System.out.println("\nNúmero de cuenta: "+numeroDeCuenta);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: $"+saldo+"\n");
    }
}
