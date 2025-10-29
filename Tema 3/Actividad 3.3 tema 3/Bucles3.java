import java.util.Random;
import java.util.Scanner;


public class Bucles3{
    static Scanner sc = new Scanner(System.in);

    /*: Diseña un programa que pide al usuario que ingrese la cantidad de números que va a
    introducir. Deberá leer la cantidad de números indicada y cuenta cuántos son positivos, negativos y
    ceros, cuantos pares y cuantos impares, mostrando esa información al finalizar la ejecución. */
    public static void ejercicio1(){
        System.out.print("¿Cuántos números va a introducir? ");
        int cantidad = sc.nextInt();

        //Ponemos contadores
        int positivo = 0;
        int negativo = 0;
        int cero = 0;
        int pares = 0;
        int impares = 0;

        //Leemos los números uno por uno
        for(int i = 1; i <= cantidad; i++){
            System.out.print("Pon el número " + i + ": ");
            int numero = sc.nextInt();

            if (numero > 0) {
                positivo++;
            }else if (numero < 0) {
                negativo++;
            }else{
                cero++;
            }

            if (numero % 2 == 0) {
                pares++;
            }else{
                impares++;
            }
        }

        System.out.println("\nResultados");
        System.out.println("Positivo: " + positivo);
        System.out.println("Negativo: " + negativo);
        System.out.println("Ceros: " + cero);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    /*Crea un programa que solicite un número y muestra su tabla de multiplicar del 1 al 10. */
    public static void ejercicio2(){
        System.out.print("Pon un número ");
        int numero = sc.nextInt();

        System.out.println("\nTabla de multiplicar " + numero + ": ");
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + "x " + i + "= " + (numero * i));
        }
    }

    /*Diseña un programa que permita al usuario convertir temperaturas de Celsius a
    Fahrenheit y viceversa. Ofrece un menú para elegir la conversión.
    (Para pasar de Celsius a Fahrenheit: (°C * 1,8) + 32 y de Fahrenheit a Celsius: (ºF-32)/1.8)*/
    public static void ejercicio3(){
        System.out.println("Vamos a convertir de Celsius a Fahrenheit y viceversa ");
        int opcion;
        double temperatura, resultado;

        do {
            System.out.println("Vamos con las conversiones ");
            System.out.println("1. De Celsius a Fahrenheit ");
            System.out.println("2. De Fahrenheir a Celsius ");
            System.out.println("3. Salir de las conversiones ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Pon la temperatura en Celsius para pasarlo a Fahrenheit");
                    temperatura =sc.nextDouble();
                    resultado = (temperatura * 1.8) + 32;
                    System.out.printf("%.2f °C equivalen a %.2f °F\n\n", temperatura, resultado);
                    break;

                case 2:
                    System.out.print("Pon la temperatura en Fahrenheit para pasarla a Celsius");
                    temperatura = sc.nextDouble();
                    resultado = (temperatura - 32)/1.8; 
                    System.out.printf("%.2f °F equivalen a %.2f °C\n\n", temperatura, resultado);
                    break;

                case 3:
                System.out.println("Salgamos de este programa ");
                break;


                default:
                System.out.println("Error en algo ponlo BIEN ");
                
            }
        } while (opcion != 3);
    }

    /*Implementa un programa que pida un número entero al usuario y determine si es un
    número perfecto. Un número es perfecto si es igual a la suma de sus divisores propios. (Los divisores
    propios de un número son aquellos números por los que es divisible un número sin contar el
    número). */
    public static void ejercicio4(){
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        int sumaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
            sumaDivisores += i;
            }
        }
        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }

    /*Crea un programa que pida al usuario un número entero positivo y calcule la suma de
    todos los números primos hasta ese número. */
    public static void ejercicio5(){
        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int suma = 0;

        for (int i = 2; i <= numero; i++) {
            boolean esPrimo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }   
            if (esPrimo) {
                suma += i;
            }
        }
            System.out.println("La suma de los números primos hasta " + numero + " es: " + suma);
        }
    }

    /*Diseña un programa que simule una casa de apuestas. Se comenzará con un saldo de
    100€. Pedirá al usuario que cantidad quiere apostar, la cual deberá estar entre 1 y el saldo
    disponible. Se deberá generar un booleano aleatorio (random.nextBoolean()), en caso de que salga
    true, el usuario gana el importe apostado. Se jugará a este juego mientras quiera el usuario y/o
    quede saldo. */
    public static void ejercicio6(){
        Random random = new Random();
        double saldo = 100.0; // Saldo inicial
        boolean jugar = true; // Variable para controlar el juego
        System.out.println("Bienvenido a la casa de apuestas. Tu saldo inicial es: " + saldo + "€");

        while (jugar && saldo > 0) {
            System.out.print("Introduce la cantidad que deseas apostar (entre 1 y " + saldo + "): ");
            double apuesta = sc.nextDouble();

            if (apuesta < 1 || apuesta > saldo) {
                System.out.println("La cantidad apostada debe estar entre 1 y " + saldo + "€.");
                continue; 
            }

            boolean resultado = random.nextBoolean();
            if (resultado) {

                saldo += apuesta; 
                System.out.println("¡Ganaste! Tu saldo ahora es: " + saldo + "€.");
            } else {
                saldo -= apuesta;
                System.out.println("Perdiste. Tu saldo ahora es: " + saldo + "€.");
            }

            sc.nextLine();

            if (saldo > 0) {
                String respuesta;
                System.out.print("¿Quieres seguir jugando? (si/s): ");
                do {
                    respuesta = sc.nextLine().toLowerCase();
                } while (!(respuesta.equals("si") || respuesta.equals("s") || respuesta.equals("no")
                    || respuesta.equals("n")));
                    jugar = (respuesta.equals("si") || respuesta.equals("s"));
            } else {
                System.out.println("No tienes saldo suficiente para seguir jugando.");
                jugar = false; 
            }
        }
        System.out.println("Gracias por jugar. Tu saldo final es: " + saldo + "€.");
    }


    /*Crea un programa que simule una quiniela, para ello se deberá leer el resultado de 15
    partidos. El usuario deberá introducir 1, X o 2. Almacenaremos los valores en variables para luego
    poder usarlas. Debemos controlar que solo pueda introducir 1, X o 2
    Una vez pedidos todos los resultados iremos generando aleatoriamente el resultado de los partidos,
    si gana el equipo de casa (1), empatan(X) o gana el equipo visitante.
    Debemos mostrar para finaliza el resultado del partido y el que puso el usuario, y finalmente el
    número de aciertos. Los aciertos en la quiniela se cuentan del 1 al 14 + el pleno al 15.*/
    public static void ejercicio7(){
        Random random = new Random();
        String apuesta;
        String resultado;
        int aciertos_1_14 = 0;
        boolean aciertos_15 = false;
        System.out.println("Introduce tu apuesta para 15 partidos (1 = gana local, X = empate, 2 = gana visitante):");

        for (int i = 1; i <= 15; i++) {
            System.out.print("Partido " + i + ": ");
            do {
                apuesta = sc.next().toUpperCase();
                if (!apuesta.equals("1") && !apuesta.equals("X") && !apuesta.equals("2")) {
                    System.out.print("Resultado no válido, introduce otro: ");
                }
            } while (!apuesta.equals("1") && !apuesta.equals("X") && !apuesta.equals("2"));
            
            int resultadoAleatorio = random.nextInt(3); // 0 para 1, 1 para X, 2 para 2
            if (resultadoAleatorio == 0) {
                resultado = "1"; // Gana local
            } else if (resultadoAleatorio == 1) {
                resultado = "X"; // Empate
            } else {
                resultado = "2"; // Gana visitante
            }

            if (i != 15) {
                if (resultado.equals(apuesta)) {
                    aciertos_1_14++;
                    System.out.println("Partido " + i + ": Resultado = " + resultado + ", Tu apuesta = " + apuesta + ". Has acertado!!!");

                } else {
                    System.out.println("Partido " + i + ": Resultado = " + resultado + ", Tu apuesta = " + apuesta + ". No acertado");
                }
            } else {

                if (resultado.equals(apuesta)) {
                    aciertos_15 = true;
                    System.out.println("Pleno al " + i + ": Resultado = " + resultado + ", Tu apuesta = " + apuesta + ". Has acertado el pleno al 15!!!");
                } else {
                    System.out.println("Pleno al " + i + ": Resultado = " + resultado + ", Tu apuesta = " + apuesta + ". No acertado");
                }   
            }
        }


        System.out.println("\nNúmero total de aciertos: " + aciertos_1_14);
        if (aciertos_15) {
            System.out.println("Has acertado también el pleno al 15");
        } else {
            System.out.println("NO has acertado también el pleno al 15");
        }
    }
    

    /*Crea un programa que lea una frase por teclado y la convierta al formato camelCase. Por
    ejemplo, si introducimos por teclado “hola como estás”, el programa deberá mostrar
    “HolaComoEstás”.
    Pistas:
    o Recuerda que podemos ir cogiendo carácter a carácter de una cadena usando la función
    cadena.charAt(i), donde cadena es nuestra variable cadena y la i la posición del carácter.
    o Podemos pasar a minúscula un carácter con la función: Character.toLowerCase(c), donde c
    es el carácter a convertir.
    o Podemos pasar a mayúsculas un carácter con la función: Character.toUpperCase(c), donde c
    es el carácter a convertir. */
    public static void ejercicio8(){
        boolean convertirSiguiente = false;
        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.nextLine();

        String camelCase = "";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (caracter == ' ') {
                convertirSiguiente = true;
            } else {
                if (camelCase.length() == 0) {
                    camelCase += (Character.toLowerCase(caracter));
                } else if (convertirSiguiente) {
                    camelCase += (Character.toUpperCase(caracter));
                    convertirSiguiente = false;
                } else {
                    camelCase += (Character.toLowerCase(caracter));
                }
            }
        }

        System.out.println("Texto en formato camelCase: " + camelCase);
    }

    



    public static void main(String[] args) throws Exception{
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4(),
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
    }





}