import java.util.Random;
import java.util.Scanner;


public class Arrays1 {

    static Scanner sc = new Scanner(System.in);

    /*Realiza un programa que pida al usuario un número natural n,
    a partir de ese número le pediremos n veces que nos
    introduzca otros números que almacenaremos en un array a y
    mostraremos por pantalla.
     */
    public static void Ejercicio1(){
        System.out.println("Introduce un número ");
        int[] a = new int[sc.nextInt()];
        
        for(int i = 0; i < a.length; i++){
            System.out.println("Pon los números " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("Los números introducidos son: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
    }

    /*Realiza un programa que teniendo un array relleno con
    valores a de tamaño 5 no es necesario que los valores los
    introduzca el usuario realice una copia del mismo en otra
    variable array b y lo muestre por pantalla.
     */
    public static void Ejercicio2(){
        int[] a = {1,2,3,4,5}; //Declaramos el Array

        int[] b = new int [a.length];  //Declaramos un segundo Array del mismo tamaño
        

        // Copiamos los valores de 'a' en 'b'
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }

        //Mostramos los valores de ambos Arrays
        System.out.println("El Array de a es: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();

        System.out.println("El Array de b (copia de a) es: ");
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i] + " ");
        }

    }


    /*Realiza un programa que pida números enteros positivos al
    usuario y los vaya almacenando en un array a, cuando el
    usuario introduzca -1 se dejará de pedir números y se
    mostrará el array a de los números que ha introducido
    exceptuando el -1. */
    public static void Ejercicio3(){
                // ----- 1. DECLARACIÓN DE VARIABLES -----

        int[] a = new int[50];      // Array muy amplio por si se mete muchos números
        int numero = 0;             // Variable para guardar el número introducido
        int contador = 0;           // Contador para saber cuántos números válidos hay
        
                    // ----- 2. ENTRADA DE DATOS -----

        System.out.println("Pon números enteros positivos. Para acabar escribe -1");
        

        // Bucle que pide números hasta que se introduzca -1
        while (numero != -1) {
            numero = sc.nextInt();
            if (numero != -1) {     // Si el número no es -1, lo guardamos en el array
                a[contador] = numero;
                contador++;
            }
        }

            // ----- 3. SALIDAD DE RESULTADOS -----
        System.out.println("Los números introducidos son: ");
        for (int i = 0; i < contador; i++){
            System.out.println(a[i]);   // Mostramos los números almacenados
        } 
    }



    /*Realiza un programa que pida al usuario un array a de 10
    elementos y muestre por pantalla un array b que contenga los
    elementos al revés, finalmente muestra por pantalla el array b. */
    public static void Ejercicio4(){
            // ----- 1. DECLARACIÓN DE ARRAYS -----
        int[] a = new int[10];
        int[] b = new int[10];
        
            // ----- 2. ENTRADA DE DATOS -----

        System.out.println("Pon 10 números enteros:");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt(); // Guardamos los números introducidos por el usuario
        }
          
            // ----- 3. INVERSIÓN DEL ARRAY -----

        for(int i = 0; i < a.length; i++){
            b[i] = a[a.length -1 - i];  // Copiamos los elementos en orden inverso
        }

            // ----- 4. SALIDA DE RESULTADOS -----
        System.out.println("El array b al revés es:");
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);   // Mostramos el array invertido
        }        
    }


    /*Realiza un programa que pida al usuario un conjunto de
    números para un array a de 8 elementos y muestre por
    pantalla un array b que solo contenga los elementos impares.
    */
    public static void Ejercicio5(){
        int[] a = new int[8];   //Array original
        int contadorimpares = 0;
        
        System.out.println("Pon 8 números enteros: ");
        for(int i = 0 ; i < a.length; i++){
            System.out.println("Número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
            if (a[i] % 2 != 0) { //Para los impares
                contadorimpares++;
            }
        }   
        // Crear el array b con el tamaño justo para los impares
        int[] b = new int[contadorimpares]; //Array para números impares 
        
        // Rellenar el array b con los elementos impares de a
        int c = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i] % 2 != 0) {
                b[c] = a[i];
                c++;
            }
        }
        //Representamos el Array b
        System.out.println("\nArray con números impares");
        if (b.length == 0) {
            System.out.println("No hay números impares");
        } else{
            for(int num : b){
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }

    /*Realiza un programa que pida al usuario 9 números naturales
    y los almacene en un array a, tras ello, introducir todos los
    números que sean pares en un array b y los que sean
    impares en un array c, tanto el array b como el array c se
    tendrán que mostrar por pantalla. */
    public static void Ejercicio6(){
        int[] a = new int[9];
        int contadores = 0; //Contador de pares
        int contador2 = 0; //Contador de impares
        System.out.println("Pon 9 números enteros: ");

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                contadores++;
            } else {
                contador2++;
            }
        }
        int[] b = new int[contadores]; //Array para números pares
        int[] c = new int[contador2]; //Array para números impares
        int p = 0; //Índice para el array b
        int q = 0; //Índice para el array c

        for(int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0) {
                b[p] = a[i];
                p++;
            }else{
                c[q] = a[i];
                q++;
            }
        }
        //Mostramos el Array b
        System.out.println("\nArray con números pares:");
        for(int num : b){
            System.out.println(num + " ");
        }
        //Mostramos el Array c
        System.out.println("\nArray con números impares:");
        for(int num : c){
            System.out.println(num + " ");
        }
    }

    /*Escribe un programa que pida 10 números por teclado, los
    almacene en un array y que luego muestre el máximo valor, el
    mínimo y las posiciones que ocupan en el array.
    */
    public static void Ejercicio7(){
        int[] a = new int[10];
        System.out.println("Pon 10 números enteros: ");
        
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("El valor máximo es : " + max);
        System.out.println("El valor mínimo es : " + min);
        System.out.println("Las posiciones del valor máximo son: ");
        for(int i = 0; i < a.length; i++){
            if (a[i] == max){
                System.out.println(i + " ");
            }
        }
        System.out.println("Las posiciones del valor mínimo son: ");
        for(int i = 0; i < a.length; i++){
            if (a[i] < min) {
                System.out.println(i + " ");                
            }
        }
    }

    /*Escribe un programa que genere 20 números enteros
    aleatorios entre 0 y 99 y los almacene en un array. El programa
    debe crear un nuevo array con los números pares que haya
    entre esos 20 números. Luego debe mostrar los dos arrays. */
    public static void Ejercicio8(){
        int[] a = new int[20]; //Array original
        System.out.println("Los números generados son:");

        //Generar los 20 números
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 100);
            System.out.println(a[i] + " ");
        }
        System.out.println(); //Salto de línea

        int contadorpares = 0;
        for(int num : a){
            if (num % 2 == 0) {
                contadorpares++;
            }
        }
        int[] pares = new int[contadorpares]; //Para los números pares
        int j = 0;
        for(int num : a){
            if (num % 2 == 0) {
                pares[j] = num;
                j++;
            }
        }
        System.out.println("Los números pares son: ");
        for(int num : pares){
            System.out.println(num + " ");
        }
    }

    /*Realiza un programa que dado un array desordenado lo
    ordene y lo muestre por consola siguiendo el algoritmo que
    desees. */
    //public static  Ejercicio9(){
        
    //}


    /*Haz un programa que genere 20 números enteros del 1 al
    50 ambos inclusive y los almacene en un array,
    posteriormente almacenará en un nuevo array solo los
    números primos que haya en ese array. Ambos arrays
    finalmente serán mostrados por consola.
     */
    //public static  ordenar(int[] array){
        
    //}


    /*Realiza un programa que dado un array bidimensional, lo
    muestre por pantalla con la siguiente estructura: */
    public static void Ejercicio11(){
        
        //----- Crear el array bidimensional
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {4, 5, 3},
            {4, 2, 1}
        };

        //----- Mostrar el array
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*Realiza un programa que dado un array bidimensional lo
    rellene de números enteros aleatorios del 2 al 12 (ambos
    inclusive) */

    public static void Ejercicio12(){
        // -------Generamos el Random para los números
        Random random = new Random();
        
        // ----Creamos un array de x filas y x columnas
        int[][] matriz = new int[3][4];

        // ----Generar la matriz con números aleatorios
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(11) + 2;
            }
        }
        // -------Mostrarla
        System.out.println("Esta es la matriz ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*Realiza un programa que inserte en un array bidimensional
    de 3x3 de números enteros, compuesto solamente por 0, tres
    valores 1 en una posición aleatoria, no pueden solaparse, es
    decir, ocupar la misma casilla alguno de los tres valores,
    después muestra por pantalla el contenido del array.
     */

    public static void Ejercicio13(){
        Random random = new Random();
        int[][] matriz = new int[3][3];

        //Colocar exactamente 3 unos sin solapamiento
        int colocados = 0;
        while (colocados < 3){
            // Generar fila y columna aleatoria entre 0 y 2
            int fila = random.nextInt(3);
            int columna = random.nextInt(3);
            //Comprobar si la posición está vacía (== 0)
            if (matriz[fila][columna] == 0) {
                matriz[fila][columna] = 1;   // colocar un 1
                colocados++;
            }
            //si ya había un 1 el bucle while repite y genera otra posición
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /*Realiza un programa que pida al usuario el tamaño en las
    dos dimensiones (X e Y) de un array bidimensional, construya
    un array bidimensional (con esas dimensiones) con todas las
    posiciones con el valor 0 y lo muestre por pantalla.
    Posteriormente se va introducir en el array el valor 1 en todas
    las posiciones exceptuando las que estén en los bordes
    exteriores del array */

    public static void Ejercicio14(){

    }


    /*Realiza un programa que inserte en un array bidimensional
    de 5x5 de números enteros, compuesto solamente por 0, tres
    valores 1 de manera aleatoria, no pueden solaparse, es decir,
    ocupar la misma casilla alguno de los tres valores, ni pueden
    estar en casillas contiguas vertical u horizontalmente
    (diagonalmente sí) después muestra por pantalla el contenido
    del array.
    */

    public static void Ejercicio15(){
        Random random = new Random();
        int[][] matriz = new int[5][5];

        int colocados = 0;
        while (colocados < 3) {
            int fila = random.nextInt(5);
            int columna = random.nextInt(5);                          //REVISAR!!!!!!!!!!
                                                                            //REVISAR!!!!!!!!!!
                                                                            //REVUSAR!!!!!!!!!!
            if (matriz[fila][columna] == 0) {
                matriz[fila][columna] = 1;
                colocados++;
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }


    /*Realiza un programa en donde dado un array bidimensional
    de tamaño 5x5 (con las posiciones con el valor 0) el usuario
    puede introducir los números que él desee uno a uno, hasta
    que introduzca la letra n. Cada vez que el usuario introduzca
    un número se le mostrará el contenido del array */

    public static void Ejercicio16(){
        int[][] matriz = new int[5][5];
        int fila = 0;
        int columna = 0;
        String entrada;
        System.out.println("Matriz de 5x5, introduce números enteros, (introduce n para salir) ");

        while (true) {
            System.out.print("Pon un número o pulsa n para salir");
            entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("n")) {
                System.out.println("Finalizando programa ");
                break;
            }

            try{
                int numero = Integer.parseInt(entrada);
                matriz[fila][columna] = numero;
                
                



            }
        }
    }

    /*Realiza un tablero de ajedrez con cuadros negros: \u25A1,
    cuadro blancos: \u25A0 y una dama ۩ presenta la dama en
    una posición cualquiera (al azar) del tablero (array
    bidimensional) y vas a pedir la nueva coordenada de la dama
    en el tablero, existen dos posibilidades: que no sea válida (se
    informará al usuario que no es válida y que no se puede
    realizar el movimiento) o que sea válida (en este caso se
    mostrará la nueva disposición de la dama en el tablero), según
    las reglas del ajedrez. En ambos casos se le pedirá al usuario
    si desea seguir jugando (s->Sí y n->No) y en caso afirmativo se
    le volverá a pedir las nuevas coordenadas y el proceso volverá
    a empezar. */

    public static void Ejercicio17(){

    }
    
    

    public static void main (String[] args){
    //Ejercicio1();
    //Ejercicio2();
    //Ejercicio3();
    //Ejercicio4();
    //Ejercicio5();
    //Ejercicio6();
    //Ejercicio7();
    //Ejercicio8();
    //Ejercicio11();
    //Ejercicio12();
    //Ejercicio13();
    //Ejercicio14();
    //Ejercicio16();
    //Ejercicio17();
    }
}