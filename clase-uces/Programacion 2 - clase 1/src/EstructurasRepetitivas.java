public class EstructurasRepetitivas {
    

    public static void main(String[] args) {
        
        // Teoría
        //Ciclo FOR
        System.out.println("Ciclo FOR");
        for (int i=0; i<10; i++) {
            System.out.println(i);
        }

        System.out.println("Ciclo WHILE");//Un salto de línea

        //Ciclo WHILE
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("Ciclo DO WHILE");

        //Ciclo DO WHILE
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j<10);


        //Ejercicio 5: 
        /* 1.Con las 3 estructuras repetitivas, imprimir los números entre el 30 y 50.
         * 2. Realizar lo mismo, pero solo imprimir los números pares.
         */
        System.out.println("\nResolución del ejercicio\n");
        //Resolución
        cicloFor();
        System.out.println();
        cicloWhile();
        System.out.println();
        cicloDoWhile();
    }

    private static void cicloFor() {
        for (int i=30; i<50; i++) {

            if (esPar(i)) {
                System.out.println(i);
            }
        }
    }

    private static void cicloWhile() {
        int i=30;
        while (i<50) {
            System.out.println(i);
            i+=2;
        }
    }

    private static void cicloDoWhile() {
        int i=30;
        do {

            if (esPar(i)) {
                System.out.println(i);
            }
            i++;
        } while (i<50);
    }
    //Para poder realizar el punto 2
    private static boolean esPar(int i) {
        return i%2==0 ? true:false;
    }
}
