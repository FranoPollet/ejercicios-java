package Ejercicio15;

public class Circulo {
    
    double radio;
    double pi = 3.14;

    public double calcularArea(){
        return pi*radio*radio;
    }

    public double calcularPerimetro(){
        return 2*pi*radio;
    }
}
