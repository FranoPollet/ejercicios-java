public class Matrices {

    //Parte 5 de la clase
    
    public static void main(String[] args) {
        
        //Como declaramos una matriz?

        int[][] matriz = {
            {1,2,3},
            {4,5,6}
        };

        //Tenemos 2 formas distintas de recorrerla

        //1-Recorrido por fila
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.println(matriz[i][j] + "");
            }
            System.out.println(); //Nueva línea después de cada fila
        }

        //2-Recorrido por columna
        for (int j=0; j<matriz[0].length; j++) {//Usamos la longitud de la primera fila para determinar la cantidad de columnas | por eso el j<matriz[0].length
            
            for (int i=0; i<matriz.length; i++) {
                System.out.println(matriz[i][j] + "");
            }
            System.out.println(); //Nueva línea después de cada fila
        }


        //Ejercicio Matrices: Dada la siguiente matriz
        /* 
        Indicar si alguna fila tiene todos los elementos múltiplos de 2
        Indicar si alguna fila tiene algún elemento múltiplo de 2
        Indicar si alguna columna tiene todos los elementos múltiplos de 3. */
        int[][] matriz2 = {
            { 9, 12, 18 },
            { 14, 10, 30 },
            { 9, 6, 3 },
        };

        System.out.println("Hay filas con todos sus elementos múltiplos de 2? " + todosDos(matriz2));

        System.out.println("Hay filas con algún elemento múltiplo de 2? "+ algunDos(matriz2));

        System.out.println("Hay alguna columan que tenga todos sus elemento múltiplos de 3? "+ todosTres(matriz2));
    }

    private static boolean todosDos(int[][] matriz) {
        boolean rta = false;
        int acumulador = 0;

        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (multiploDos(matriz[i][j])) {
                    acumulador += 1;
                }
            }
            if (acumulador==matriz[i].length) {
                rta = true;
            }
            acumulador = 0;
        }
        return rta;        
    }

    private static boolean algunDos(int[][] matriz) {
        boolean rta = false;
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (multiploDos(matriz[i][j])) {
                    rta = true;
                }
            }
        }
        return rta;        
    }

    private static boolean todosTres(int[][] matriz) {
        boolean rta = true;
        int acumulador = 0;
        for (int j=0; j<matriz[0].length; j++) {
            for (int i=0; i<matriz.length; i++) {
                if (multiploTres(matriz[i][j])) {
                    acumulador += 1;
                }
            }
            if (acumulador==matriz.length) {
                rta = true;
            }
            acumulador = 0;
        }
        return rta;
    }   

    private static boolean multiploDos(int i) {
        return i%2==0 ? true:false;
    }
    private static boolean multiploTres(int i) {
        return i%3==0 ? true:false;
    }
    


}
