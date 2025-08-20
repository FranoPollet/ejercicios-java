public class App {
    //Principio de la clase 1
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Arrays
        int[] numeros = {3, 4, 7, 1};
        //Algo que hice viendo W3School para recorrer más fácil el array
        for (int i : numeros){
            System.out.println(i);
        }
        //System.out.println(numeros); //<-- Esto esta mal
        System.out.println(numeros[0]);     //Imprimimos el indice 0 =3
        System.out.println(numeros.length); //El tamñano del vector

        //se hace con un for igual que en prog 1
        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        numeros[0]=10; //Cambiamos el indice sub 0;
        //System.out.println(numeros.clone()); //Con esto clonamos el vector
        /*
        int[] aux = numeros.clone();
        System.out.println(aux[0]);
        */

        //Hay arrays de numeros, y de otro tipo de datos...
        String[] nombre = {"Juan", "Pedro", "Raul"};
        System.out.println(nombre[0]);
        
        //Ejercicio 1: Dado los siguientes 2 vectores 
        String[] nombres = {"Silla","Mesa","Tele"};
        double[] precios = {100.0,200.0,120.0};
        //Resolución:
        imprimirMayores100(nombres, precios);

        //Otra forma más pro
        //Operador ternario
        for (int i=0; i<precios.length; i++) {
            System.out.println( (precios[i]>100) ? "Producto: "+nombres[i]+ ", Precio = $"+ precios[i] : "");
        }

        //Otra cosa que funciona con un método externo más abajo
        imprimir(numeros);

        //scanner.close()
    }

    //Creamos una función privada que imprime todos los indices del vector/array "numeros"
    private static void imprimir(int[] numeros) {
        for (int i = 0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }


    //Método para resolver el ejercicio
    private static void imprimirMayores100(String[] nombres, double[] precios) {
        for (int i=0; i<nombres.length; i++) {
            if (precios[i]>100) {
                System.out.println(nombres[i]+" = $"+precios[i]);
            }
        }
    }
}
