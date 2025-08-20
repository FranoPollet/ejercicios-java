public class Matriz {

    //! 2° PARTE DE LA CLASE MATRICES
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo Matricial");


        //*Creación de matrices
        int[][] matriz = {
            {4,5,6,9},
            {2,9,6,3},
            {2,1,5,24}
        };
        //?Cada fila de la matriz debe tener la misma cantidad de columnas
        System.out.println("Tamaño de la matriz "+matriz.length+" -->Filas");

        imprimirMatriz(matriz);

        //?Ejercicio 1:
        System.out.println(todasLasFilasConAlgunElementoImpar(matriz));

        recorridoPorColumna(matriz);

        //?Ejercicio 2: indicar si alguna las columnas son multiplos de 3
        System.out.println(algunaColumnaTodosMultiplos3(matriz));
    }
    //Todo Formas de imprimir las matrices

    //*1) 2 Ciclos anidados --> Recorrido por fila
    private static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) { //Matriz sub 0 (matriz[0]) nos da el tamaño de las filas osea no dice la cantidad de columnas
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    //?Ejercicio 1
    private static boolean todasLasFilasConAlgunElementoImpar(int[][] matriz){
        //MI resolución
        boolean rta = false;
        int impares = 0;
        boolean flag;
        for (int i = 0; i < matriz.length; i++) {
            //int acumulador = 0;
            flag = false;
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]%2!=0){
                    //acumulador++;
                    flag = true;
                }
            }
            if (/*acumulador>0 ||*/ flag){
                impares++;
            }
        }
        if (impares==3){
            rta = true;
        }
        return rta;

        /*
         * Resolución del profe
         * boolean rta = true;
         * for (int i=0; i<matriz.length; i++){
         *      rta = rta && algunElemntoImpar(matriz[i])
         * }
         * return rta; //Todo Probarlo
         */
    }

    //*2) Recorrido por columna tambien son 2 ciclos for
    private static void recorridoPorColumna(int[][] matriz){
        for (int i = 0; i < matriz[0].length; i++) { //Columna
            for (int j = 0; j < matriz.length; j++) { //Fila
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println();   
        }
    }

    //?Ejercicio 2
    private static boolean algunaColumnaTodosMultiplos3(int[][] matriz){
        /*Mi resolución
        boolean rta = false;
        int acum = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            boolean columna = true;
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i]%3!=0){
                    columna = false;
                }
            }
            if (columna){
                acum++;
            }
        }
        if (acum>0){
            rta = true;
        }
        return rta;*/

        //*Resolución del profe
        boolean rta = false;
        for (int col = 0; col < matriz[0].length; col++) {
            rta = rta || columnaMultiplos3(matriz, col);
        }
        return rta;
    }

    private static boolean columnaMultiplos3(int[][] matriz, int columna){
        boolean rta = true; //Pq es TODA la columna
        for (int i = 0; i < matriz.length; i++) {
            rta = rta && matriz[i][columna]%3==0;
        }
        return rta;

    }

}
