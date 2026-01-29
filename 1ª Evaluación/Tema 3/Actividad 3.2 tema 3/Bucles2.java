import java.util.Scanner;

public class Bucles2 {
    static Scanner sc = new Scanner(System.in);

    /*
     * Diseñar un programa que pida un número por teclado y escriba tantas líneas
     * como diga
     * el número y en cada línea escriba desde el número 1 hasta el número
     * introducido.
     * Ejemplo: Si se introduce el número 5, el programa deberá mostrar en pantalla:
     * 12345
     * 12345
     * 12345
     * 12345
     * 12345
     */

    public static void ejercicio1() {
        System.out.print("Escriba un número ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * Diseñar un programa que haga lo mismo que el anterior, pero en este caso
     * deberá
     * escribir los números en orden decreciente, es decir, si introducimos el
     * número 5 deberá mostrar en
     * pantalla:
     * 54321
     * 54321
     * 54321
     * 54321
     * 54321
     */
    public static void ejercicio2() {
        System.out.print("Escriba un número ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = numero; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /*
     * Deberéis diseñar un programa similar al anterior, pero en lugar de escribir
     * en lugar de
     * imprimir en todas las líneas todos los números desde el 1 hasta el
     * introducido por teclado, en la
     * primera línea se imprimirá sólo el número 1, en la segunda el 1 y el 2, y así
     * hasta escribir el número
     * de líneas indicadas por el usuario.
     * Ejemplo: Si el usuario imprime el número 5, el programa mostrará en pantalla:
     * 1
     * 12
     * 123
     * 1234
     * 12345
     */
    public static void ejercicio3() {
        System.out.print("Introduzca un número ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    /*
     * Diseña un programa que escriba todos los números del 100 al 0 de 7 en 7, es
     * decir,
     * mostrará 100, 93, 86…0.
     */
    public static void ejercicio4() {
        for (int i = 100; i > 0; i -= 7) {
            System.out.println(i);
        }
        System.out.println(0);
    }

    /*
     * Desarrollar un programa que te pregunte cuando números quieres leer. Nosotros
     * deberemos leer la cantidad de números indicada y calcula el promedio de los
     * valores indicados.
     */
    public static void ejercicio5() {
        System.out.print("¿Cuántos números quiere introducir? ");
        int cantidadnumeros = sc.nextInt();
        double suma = 0;
        for (int i = 1; i <= cantidadnumeros; i++) {
            System.out.print("Pon el número que desea introducir " + i + ": ");
            double numero = sc.nextDouble();
            suma += numero;
        }
        double promedio = suma / cantidadnumeros;
        System.out.println("El promedio de los números es " + promedio);
    }

    /*
     * Realiza un programa que lea un número por teclado y nos diga si el número es
     * o no
     * primo. (Los números primos son aquellos que sólo son divisibles por ellos
     * mismos y por la unidad).
     */
    public static void ejercicio6() {
        System.out.print("Introduzca un número ");
        int numero = sc.nextInt();
        boolean Esprimo = true;
        if (numero <= 1) {
            Esprimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    Esprimo = false;
                    break;
                }
            }
        }
        if (Esprimo) {
            System.out.print("El número es primo ");
        } else {
            System.out.print("El número no es primo ");
        }
    }

    /*
    Desarrollar un programa que lea números enteros hasta teclear 0, y nos
    muestre el
    máximo, el mínimo y la media de todos ellos. El 0 no se debe contar como
    número introducido, solo
    como valor de salida.
     */
    public static void ejercicio7() {
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números enteros (Recureda el 0 para salir) ");


        while (true) {
            numero = sc.nextInt();
            if(numero == 0){
                break;
            }
            suma += numero;
            contador++;

            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }
        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("El máximo es " + maximo);
            System.out.println("El mínimo es " + minimo);
            System.out.println("La media es " + media);
        }else{
            System.out.println("No se introdujeron números");
        }
    }

    /*
     * Escribe un programa en Java que implemente una calculadora simple. La
     * calculadora
     * debe permitir a los usuarios realizar operaciones matemáticas básicas, como
     * suma, resta,
     * multiplicación y división. El programa deberá mostrar un menú con las
     * siguientes opciones:
     * 1. Sumar
     * 2. Restar
     * 3. Multiplicar
     * 4. Dividir
     * 5. Es primo (indica si el número introducido es primo o no lo es)
     * 6. Salir
     * Cuando el usuario selecciona una opción (del 1 al 5), el programa debe
     * solicitar los números
     * necesarios para realizar la operación y mostrar el resultado de dicha
     * operación. El programa debe
     * repetir el proceso hasta que el usuario seleccione la opción "Salir".
     * La opción “Salir” muestra un mensaje de despedida y finaliza la ejecución del
     * programa
     */
    public static void ejercicio8() {
        
        int opción;
        
        do{
            System.out.println("Elija una opción ");
            System.out.println("1. Sumar ");
            System.out.println("2. Restar ");
            System.out.println("3. Multiplicar ");
            System.out.println("4. División ");
            System.out.println("5. Si es primo o no ");
            System.out.println("6. Salir de la calculadora");
            opción = sc.nextInt();

            if (opción >= 1 && opción <= 4) {
                System.out.print("Pon el primer número ");
                double a = sc.nextDouble();
                System.out.print("Pon el segundo número");
                double b = sc.nextDouble();

                switch (opción) {
                    case 1: System.out.println("El resultado es: " + (a + b));
                    case 2: System.out.println("El resultado es: " + (a - b));
                    case 3: System.out.println("El resultado es: " + (a * b));
                    case 4: {
                        if (b == 0) System.out.println("No se puede dividir entre cero ");
                        else System.out.println("Resultado: " + (a / b));
                    }                        
                }


            }else if (opción == 5) {
                System.out.print("Ingresa un número entero: ");
                int numero = sc.nextInt();
                boolean primo = true;
                if (numero <= 1) primo = false;
                else {
                    for (int i = 2; i <= numero / 2; i++) {
                        if (numero % i == 0) {
                            primo = false;
                            break;
                        }
                    }
                }
                if (primo) System.out.println(numero + " es primo.");
                else System.out.println(numero + " no es primo.");

            }
            else if (opción == 6) {
                System.out.println("Fin de calculadora ");
            }else{
                System.out.println("ERROR");
            }
            
        }
        while (opción != 6);
                
    }
    

    /*
     * : : Diseña un programa que calcule la letra de un DNI. Para ello:
     * o 1º Pediremos el DNI por teclado al usuario.
     * o 2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23
     * quedándonos con el
     * resto de la división, que debe estar entre 0 y 22.
     * o Comprobaremos en la siguiente tabla, en función del resto obtenido en el
     * paso anterior, cuál
     * es la letra que corresponde
     * RESTO LETRA RESTO LETRA
     * 0 T 12 N
     * 1 R 13 J
     * 2 W 14 Z
     * 3 A 15 S
     * 4 G 16 Q
     * 5 M 17 V
     * 6 Y 18 H
     * 7 F 19 L
     * 8 P 20 C
     * 9 D 21 K
     * 10 X 22 E
     * 11 B
     * Ejemplo: Si introduzco el número 70588387, el resto de la división con 23 es
     * 7, por lo que le
     * corresponde la letra “F”.
     */
    public static void ejercicio9(){

        int DNI = -1;
        
        //Pedimos el DNI y validamos que sea un número positivo
        while (true) {
            System.out.print("Introduce el DNI sin letra: ");
            String entrada = sc.nextLine();

            // Comprobamos si contiene solo dígitos
            if (entrada.matches("\\d+")) {
                try {
                    DNI = Integer.parseInt(entrada);

                    if (DNI >= 0 && DNI <= 99999999) {
                        break;
                    } else {
                        System.out.println("El número tiene que estar entre 0 y 99.999.999.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Número demasiado grande. Introduce un valor válido.");
                }

            } else {
                System.out.println("ERROR: introduce solo números.");
            }
        }
        //Calculamos la división del DNI entre el 23
        int resto = DNI % 23;

        //Tabla de las letras según el resto
        char[] letras = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
            'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };

        //Para obtener la letra correspondiente
        char letra = letras[resto];

        //Resultado
        System.out.println("Tu número de DNi es: " + DNI + letra);

    }

    /*
     * Solicita al usuario una cadena y comprueba el número de vocales que tiene.
     * Deberás usar el método charAT(i) de la clase String para extraer un carácter
     * de la cadena, donde i es
     * la posición del carácter de la cadena que queremos obtener. Por ejemplo, si
     * quisiéramos obtener el
     * carácter número de 5 de una cadena lo haríamos así: cadena.charAT(i)
     */
    public static void ejercicio10() {
        System.out.print("Escriba una cadena ");
        String cadena = sc.nextLine();
        
        int contadorvocales = 0;

        // Recorrer la cadena carácter por carácter
        for(int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i); // Extraer carácter

            // Pasar a minúscula para simplificar la comparación
            c =Character.toLowerCase(c);

            // Comprobar si es una vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
               contadorvocales++; 
            }
        }
        System.out.println("La cadena tiene " + contadorvocales + "estas vocales ");

    }

    /*
     * Realiza el control de acceso a una caja fuerte. La combinación será un número
     * de cuatro
     * cifras. El usuario tendrá 4 oportunidades para averiguar el número.
     * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos
     * mostrará el mensaje
     * “Clave incorrecta le quedan X intentos”, si agota los 4 intentos mostrará el
     * mensaje “Lo siento has
     * agotado las 4 oportunidades” y si acertamos se nos dirá “Has abierto la caja
     * fuerte”.
     */
    public static void ejercicio11() {
        System.out.print("Bienvenido a la caja fuerte ");
        String combinacion = "1234";
        int num_intentos = 4;
        

        while (num_intentos > 0) {
            System.out.print("Pon la combinación ");
            String entrada = sc.nextLine().trim();
            
            if (entrada.equals(combinacion)) {
                System.out.println("Muy bien, has abierto la caja ");
                return;
            }
            num_intentos--;
            if (num_intentos > 0) {
                System.out.println("Clave incorrecta quedan " + num_intentos);
            }else{
                System.out.println("Has agotado las oportunidades ");
            }
        }
    }

    /*
     * Realiza un programa que compruebe si dos números son amigos. Para ello hay
     * que
     * comprobar que la suma de todos los divisores del primer número (sin contar
     * con él) es el segundo
     * número, y que la suma de todos los divisores propios del segundo número (sin
     * contar con él) es el
     * primer número. Por ejemplo:
     * - Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.
     * Su suma es 284.
     * - Los divisores propios de 284 son 1, 2, 4, 71 y 142. Su suma es 220.
     * - Por tanto, 220 y 284 son amigos.
     */
    public static void ejercicio12() {
        System.out.println("Pon el dividendo ");
        int dividendo = sc.nextInt();

        System.out.println("Pon el divisor");
        int divisor = sc.nextInt();

        int sumadivision1 = 0;
        int sumadivision2 = 0;

        // Divisores propios del dividendo
        System.out.println("Divisores propios de " + dividendo + ":");
        for(int i = 1; i < dividendo; i++){
            if (dividendo % i == 0) {
                System.out.print(i + " ");
                sumadivision1 += i;
            }
        }

        System.out.println("\nSuma de los divisores propios: " + sumadivision1);

        // Divisores propios del divisor
        System.out.println("\nDivisores propios de " + divisor + ":");
        for(int i = 1; i < divisor; i++){
            if (divisor % i == 0) {
                System.out.print(i + " ");
                sumadivision2 += i;
            }
        }
        System.out.println("\nSuma de los divisores propios: " + sumadivision2);

    }

    /*
    Realiza un algoritmo que permita calcular un número determinado de elementos
    de la
    serie de Fibonacci, teniendo en cuenta que cada uno es la suma de los dos
    elementos anteriores, con
    la excepción de los dos primeros, que son 0 y 1. Así, la serie estaría
    formada por los números: 0, 1, 1,
    2, 3, 5, 8, 13, 21…
     */
    public static void ejercicio13() {
        System.out.print("Ingrese la cantidad de elementos de la serie Fibonacci: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Ingrese un número mayor que 0. ");
        } else {
            // Variables para los dos primeros elementos
            int a = 0, b = 1;

            System.out.println("Serie de Fibonacci:");

            for (int i = 1; i <= n; i++) {
                System.out.print(a + " "); // Imprime el elemento actual

                int siguiente = a + b; // Calcula el siguiente número
                a = b; // Actualiza a
                b = siguiente; // Actualiza b
            }
        }

    }

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
    }
    
}