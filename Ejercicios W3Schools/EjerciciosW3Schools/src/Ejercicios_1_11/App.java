package Ejercicios_1_11;


public class App {

    //!EJERCICIO 1 --- CONVERSIÓN DE GRADOS ---
    static double conversionFahrenheit(double tempC) {
        double resultadoFahrenheit = (tempC*9/5) + 32;
        return resultadoFahrenheit;
    }
    static double conversionCelcius(double tempF) {
        double resultadoCelcius = (tempF-32)*5/9;
        return resultadoCelcius;
    }


    public static void main(String[] args) throws Exception {
        
        System.out.println("Hoy hacen 18° Celcius");
        double fahrenheit = conversionFahrenheit(18);
        System.out.println("Lo que equivale a "+fahrenheit+"° Fahrenheit");
        System.out.println();
        System.out.println("Los 0° Fahrenheit");
        double celcius = conversionCelcius(0);
        System.out.println("Son equivalentes a "+celcius+"° Celcius");

    }
}
