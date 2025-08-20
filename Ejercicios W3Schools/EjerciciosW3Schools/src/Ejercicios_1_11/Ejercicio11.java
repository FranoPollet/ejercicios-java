package Ejercicios_1_11;
public class Ejercicio11 {
    
    //! CALCULADORA CON MÉTODOS: SUMAR | RESTAR | MULTIPLICAR | DIVIDIR

    static int sumar(int num1, int num2){
        return num1+num2;
    }
    static int restar(int num1, int num2){
        return num1-num2;
    }
    static int multiplicar(int num1, int num2){
        return num1*num2;
    }
    static double dividir(int num1, int num2){
        if (num2==0){
            return 0;
        } else {
            return num1/num2;
        }
    }

    public static void main(String[] args) {
        int suma, resta, multiplicar;
        double dividir;
        suma = sumar(102, 5);
        System.out.println("Suma = "+suma);
        resta = restar(100, 36);
        System.out.println("Resta = "+resta);
        multiplicar = multiplicar(9, 4);
        System.out.println("La multiplicación = "+multiplicar);
        dividir = dividir(380, 7);
        System.out.println("La división = "+dividir);

    }
}
