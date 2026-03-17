import java.util.Scanner;
public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);

    /*Realiza una función llamada suma que sume dos números enteros
    y te devuelva el resultado, posteriormente llámala desde el main y
    muestra su resultado. */
    public static int Sumar(){
        System.out.println("Vamos a sumar dos números ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        return num1 + num2;
    }

    /*Realiza un método llamado holaMundo que al ser llamada
    muestre por consola el mensaje “Hola Mundo!”.
    */
    public static void holaMundo(){
        System.out.println("Hola Mundo");
    }


    /*Realiza un método llamado eco con un parámetro de entrada n,
    que al ser llamada muestre por consola el mensaje “ECO” un
    número n de veces.
    */
    public static void eco(int n){
        for(int i = 0; i < n; i++){
            System.out.println("ECO");
        }
    }


    /*Escribe un método llamado mostrarIntermedios que tenga dos
    parámetros de entrada a y b (números enteros) y muestre todos
    los números pares entre ambos números (a y b inclusive).
    */
    public static void mostrarintermedios(int a, int b){
        for(int i = a; i <= b; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    /*Realiza una función areaCirculo que reciba un parámetro r y te
    devuelva el área de un círculo de radio r.
    Nota: En un circulo: area = pi * r * 2
    Nota: en Java podemos usar el número pi con la constante de la
    clase Math PI ( se accede con Math.PI ) */
    public static double areacirculo(double r){
        return Math.PI * Math.pow(r, 2);
    }


    /*Realiza una función que reciba dos números enteros y devuelva el
    mayor de los dos, si son iguales devuelve cualquiera de los dos. */
    public static int numeromayorentero(int num1, int num2){
        if (num1 >= num2) {
            return num1;
        }else{
            return num2;
        }
    }


    /*Realiza un método llamado mostrar que te muestre un array
    bidimensional por consola.
    */
    public static void mostrar(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    /*Realiza una función llamada busqueda que dado un array de
    enteros y un elemento a buscar te devuelva el valor de la posición
    donde se encuentra el elementos a buscar en el array (una
    cualquiera de sus apariciones).
    */
    public static int busqueda(int[] array, int valor){
        boolean enc = false;
        int posicion = -1;
        for(int i = 0; i < array.length && !enc; i++){
            if (array[i] == valor) {
                enc = true;
                posicion = i;
            }
        }
        return posicion;
    }


    /*Realiza un método llamado sumaPorElementoM que reciba un
    array de enteros y un entero y le sume a cada posición del array
    recibido el entero recibido. (Ojo, es un método)
    */
    public static void sumaPorElementoM(int[] array, int valor){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] + valor;
        }
    }


    /*Realiza una función llamada sumaPorElementoF que reciba un
    array de enteros y un entero y devuelva un array con el tamaño
    del array recibido y que contiene en cada posición la suma del
    elemento del array recibido con el entero recibido
    (comportamiento parecido al ejercicio anterior). (Ojo, es una
    función)*/
    public static int[] sumaPorElementoF(int[] array, int valor){
        int[] newArray = new int[array.length];
        for(int i = 0; i <array.length; i++){
            newArray[i] = array[i] + valor;
        }
        return newArray;
    }


    /*Realiza una función llamada negacionBooleana que reciba un
    array de booleanos y devuelva un array de las mismas
    dimensiones pero donde antes había un true pasará a haber un
    false y donde antes había un false pasará a haber un true. */
    public static boolean[] negacionBooleana(boolean[] aboolean){
        boolean[] newboolean = new boolean[aboolean.length];
        for(int i = 0; i < aboolean.length; i++){
            newboolean[i] = !aboolean[i];
        }
        return newboolean;
    }

    /* Haz una función llamada factorial que reciba un entero y te
    devuelva el resultado del factorial de ese número. Usa esa función
    factorial para llamarla desde un método llamado factorialArray que
    reciba un array de enteros (se presupone que mayores de 0) y
    cambie el valor de cada posición por la del factorial del número
    que contiene. (Ojo, es un método).*/
    public static int factorial(int n){
        int resultado = 1;
        for(int i = 1; i <= n; i++){
            resultado *= i;
        }
        return resultado;
    }
    public static void factorialArray(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = factorial(numeros[i]);
        }
    }

    /*Realiza una función que cree un array bidimensional de char
    10x10 y lo inicialice poniendo en todas sus posiciones el valor ‘-’. */
    public static char[][] Matriz(){
        int filas = 10;
        int columnas = 10;
        char[][] matriz = new char[filas][columnas];

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                matriz[i][j] = '-';
            }
        }
        return matriz;
    }
    public static void mostrarmatriz(char[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*Haz un método llamado mostrarTableroRaya que genere un
    tablero de 10x10 donde en todas las casillas está el caracter ‘-’ y
    muestre el tablero de la siguiente forma: (NOTA: utiliza la función
    anterior) */
    public static char[][] mostrarTableroRaya(char[][] tablero){
        int filas = 10;
        int columnas = 10;
        char[][] matriz = new char[filas][columnas];

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                matriz[i][j] = '-';
            }
        }
        return matriz;
    }


    //////////Implementa una función espalindroma(String texto) que determine si un texto es Palindromo 
    public static boolean Palíndromo(String texto){
        // Eliminamos espacios y pasamos a minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        int izquierda = 0;
        int derecha = texto.length() -1;

        while (izquierda < derecha) {
            // Comparamos caracteres desde ambos extremos
            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return false; // Si no coinciden, no es palíndromo
            }
            izquierda++;
            derecha--;
        }
        return true;
    }


    /*Realiza una función copyArrayMasUno que reciba un array y
    devuelva un array con los elementos copiados y una posición más
    con el valor 0. */
    


    /*Realiza una función llamada noRepetidos que reciba un array
    de enteros que pueden estar repetidos y devuelva un nuevo array
    sin ningún entero repetido. (NOTA: usa la función anterior)
    Ejemplos:
    entrada: [1, 3, 0, 1, 3, 6, 2, 1] → salida: [1, 3, 0, 6, 2]
    entrada: [1, 1, 0, 1, 2, 1, 2, 1] → salida: [1, 0, 2] */
    

    /*Realiza una función llamada invertirArray que reciba un array
    de enteros y devuelva otro array con las posiciones invertidas:
    Ejemplos:
    entrada: [1, 3, 6, 2, 4, 1] → salida: [1, 4, 2, 6, 3, 1] */


    /*Realiza un método llamado ordenacionM que reciba un array
    de enteros y un char, si el char tiene el valor ‘c’ realiza la
    ordenación creciente, si el char tiene el valor ‘d’ realiza la
    ordenación decreciente.Ejemplo:
    entrada: [2, 4, 1, 3, 9, 3, 1, 1], ‘c’ → salida: [1, 1, 2, 3, 3, 4, 9]
    entrada: [2, 4, 1, 3, 9, 3, 1, 1], ‘d’ → salida: [9, 4, 3, 3, 2, 1, 1]*/


    /*20 Realiza una método que dado un array de números enteros
    positivos mayor o igual que 1 (naturales) lo ordene según el
    número de divisores que tiene cada número.
    Ejemplo:el número 6 (tiene cuatro divisores: 1, 2, 3, 6), el número
    12 (tiene seis divisores: 1, 2, 3, 4, 6, 12), el número 17 (tiene dos
    divisores: 1, 17), el número 5 (tiene dos divisores: 1 y 5). Por lo
    tanto su orden sería:
    entrada: [1, 5, 6, 17, 12] → salida: [12, 6, 17, 5, 1] (También podría
    ir el 5 antes que el 17 puesto que tienen el mismo número de
    divisores)
    NOTA1: Haz primero una función compararPorNumDivisores que
    reciba dos números enteros mayores o iguales que uno y los
    compare de tal forma que:
    si el primero tiene más divisores que el segundo la salida sea 1
    si el segundo tiene más divisores que el primero la salida sea -1
    si tienen ambos el mismo número de divisores la salida sea 0
    NOTA2: Realiza una función numDivisores que reciba un número
    entero mayor o igual que 1 y devuelva el número de divisores que
    tiene ese número.
    Ejemplo:
    entrada: 1 → salida: 1
    entrada 12 → salida: 6
    entrada 5 → salida: 2
    NOTA3: Realiza una función isDivisor que reciba dos números
    enteros mayores o iguales que uno y devuelva si el segundo es
    divisor del primero (true) o si no es divisor (false).
    Ejemplo:
    entrada: 12, 5 → salida: false
    entrada 12, 6 → salida: true
    entrada 5, 5 → salida: true */





    public static void main (String[] args){
        //Ejercicio 1
        int resultado = Sumar();
        System.out.println("El resultado es: " + resultado);


        //Ejercicio 2
        holaMundo();


        //Ejercicio 3
        eco(1);


        //Ejercicio 4
        mostrarintermedios(1,9);


        //Ejercicio 5
        double area = areacirculo(4);
        System.out.println("El área es: " + area);


        //Ejercicio 6
        numeromayorentero(1, 2);
        System.out.println("El mayor es: " + numeromayorentero(1, 2));
        

        //Ejercicio 7
        int[][] ejemploarray = {
            {5, 2, 7},
            {9, 2, 6},
            {1, 0, 3},
        };

        mostrar(ejemploarray);


        //Ejercicio 8
        int[] array2 = {3, 7, 6, 4, 8, 1};
        int valorbuscar = 6;

        int buscar = busqueda(array2, valorbuscar);

        if (buscar != -1) {
            System.out.println("El elemento " + valorbuscar + " está en la posición: " + buscar);
        } else{
            System.out.println("El valor " + valorbuscar +  " no se encuentra en el array ");
        }

        //Ejercicio 9
        int[] array = {3, 5, 6, 7, 5, 3, 8};
        int suma = 2;
        
        System.out.println("Array original: ");
        for(int n : array){
            System.out.println(n + " ");
        }

        sumaPorElementoM(array, suma);

        System.out.println("\nArray después de sumar " + suma + " por cada elemento ");
        for(int a : array){
            System.out.println(a + " ");
        }


        //Ejercicio 10
        int[] numeros = {4, 3, 5, 6};
        int suma2 = 5;

        int[] resultadoF = sumaPorElementoF(numeros, suma2);

        System.out.println("Resultado: ");
        for(int n : resultadoF){
            System.out.println(n + " ");
        }
        

        //Ejercicio 11
        boolean[] original = {true, false, false, true, true};
        boolean[] falso = negacionBooleana(original);

        System.out.print("Array original: ");
        for(boolean b : original){
            System.out.println(b + " ");
        }

        System.out.print("\nArray falso: ");
        for(boolean a : falso){
            System.out.println(a + " ");
        }


        //Ejercicio Palíndromo
        String[] pruebas = {"Ana lava la tina", "Hola"};

        for(String prueba : pruebas){
            System.out.println("\"" + prueba + "\" es palíndromo? " + Palíndromo(prueba));
        }


        //Ejercicio 12
        int[] numerosarray = {5, 3, 6, 2, 7};

        System.out.print("Array original. ");
        for(int g : numerosarray){
            System.out.println(g + " ");
        }
        System.out.println();

        factorialArray(numerosarray);
        System.out.println("Array con factoriales: ");
        for(int j : numerosarray){
            System.out.println(j + " ");
        }


        //Ejercicio 13
        



    }
}