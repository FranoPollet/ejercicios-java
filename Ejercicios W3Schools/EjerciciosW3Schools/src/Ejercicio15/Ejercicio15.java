package Ejercicio15;

public class Ejercicio15 {
    
    //! CLASE CIRCULO: con atributo radio y métodos para calcular area y perimetro

    public static void main(String[] args) {
        Circulo circulito = new Circulo();
        circulito.radio=8;
        System.out.println("El área del circulito es  = "+circulito.calcularArea());
        System.out.println("El perímetro del circulito es = "+circulito.calcularPerimetro());
    }
}
