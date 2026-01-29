import java.util.Scanner;

public class Modularidad2 {
    static Scanner sc = new Scanner(System.in); 

    /*Ejercicio 1. Cálculos básicos modulares
    Crea una clase CalculadoraModular con métodos para sumar, restar, multiplicar y dividir dos
    números. Cada operación debe ser un método independiente. Desde el main, pide dos
    números y una operación al usuario.
    Objetivo: Separar la lógica en métodos independientes y practicar el paso de parámetros
    y retorno de valores. */

    public static int sumar(int n1, int n2){
        return n1 + n2;
    }

    public static int restar(int n1, int n2){
        return n1 - n2;
    }

    public static int multiplicar(int n1, int n2){
        return n1 * n2;
    }

    public static int dividir(int n1, int n2){
        return n1 / n2;
    }

    /*Ejercicio 2. Comparador de números
    Implementa métodos que pidan dos números, determinen cuál es mayor y cuál es menor, y
    muestren el resultado.
    Objetivo: Reutilizar métodos, usar parámetros y retorno de valores.*/

    public static int numMayor(int num1, int num2){
        if (num1 > num2) {
            return num1;   
        }else {
            return num2;
        }
    }

    public static int numMenor(int num1, int num2){
        if (num1 < num2) {
            return num1;
        }else {
            return num2;
        }
    }

    /*Ejercicio 3. Clasificador de edades
    Crea métodos para leer una edad, clasificarla en categorías (niño, adolescente, adulto,
    mayor) y mostrar el resultado.
    Objetivo: Aplicar condicionales y retornar resultados textuales desde métodos.
    */
    public static String edades(){
        System.out.print("Introduce la edad, entre 0 y 80 años: ");
        int edad = sc.nextInt();

        if (edad < 12) {
            return "Niño";
        } else if (edad < 18) {
        return "Adolescente";
        } else if (edad < 60) {
        return "Adulto";
        } else{
        return "Mayor";
        }
    }


    /* Ejercicio 4. Control de acceso
    Simula un inicio de sesión con tres métodos: validarUsuario, mostrarResultado y
    ejecutarPrograma. El método main solo debe llamar a ejecutarPrograma().
    Objetivo: Practicar llamadas entre métodos y encapsulación de la lógica.*/
    public static boolean validarUsuario(String usuario, String contraseña){
        String usuariovalido = "admin";
        String contraseñavalida = "1234";
        return usuario.equals(usuariovalido) && contraseña.equals(contraseñavalida); 
    }

    public static void mostrarResultado(boolean accesoconcedido){
        if (accesoconcedido) {
            System.out.print("Acceso concedido, ¡¡Enhorabuena!! ");
        } else{
            System.out.print("Usuario y/o contraseña incorrecto, ¡¡Mal hecho!! ");
        }
    }

    public static void ejecutarPrograma(){
        System.out.print("Ingrese Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Ingrese contraseña: ");
        String contraseña = sc.nextLine();

        boolean acceso = validarUsuario(usuario, contraseña);
        mostrarResultado(acceso);
    }
        
    

    /*Ejercicio 5. Calculadora de áreas
    Implementa métodos para calcular el área de figuras geométricas (cuadrado, rectángulo y
    círculo) y un método menu() que gestione las opciones.
    Objetivo: Diseñar un flujo modular con un menú central que llame a métodos
    especializados.*/
    public static double cuadrado(double lado){
        return lado * lado;
    }

    public static double rectangulo(double base, double altura){
        return base * altura;
    }

    public static double circulo(double radio){
        return Math.PI * radio * radio;
    }

    public static void menu(){
        int opcion;
        do {
            System.out.println("Vamos a clacular el área de diferentes figuras geométricas: ");
            System.out.println("Opción 1: Área del cuadrado");
            System.out.println("Opción 2: Área del rectángulo");
            System.out.println("Opción 3 :Área del círculo");
            System.out.println("Opción 4: Salir de la aplicación");
            System.out.print("Elija una opción");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Pon él área del cuadrado: ");
                    double lado = sc.nextDouble();
                    System.out.println("El área del cuadrado es: " + cuadrado(lado));
                    break;
            
                case 2:
                    System.out.print("Pon la base del rectángulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Pon la altura del rectángulo: ");
                    double altura = sc.nextDouble();
                    System.out.println("El área del rectángulo es: " + rectangulo(base, altura));
                    break;

                case 3:
                    System.out.println("Pon el área del círculo: ");
                    double radio = sc.nextDouble();
                    System.out.println("El área del círculo es: " + circulo(radio));
                    break;

                case 4:
                    System.out.println("Lo entiendo, ahora no te apetece calcular áreas =(");
                    break;
                default:
                    System.out.println("Has seleccionado mal, deberías ver mejor las teclas que estás pulsando =)");
                    break;
            }
            System.out.println();
        } while (opcion != 4);
    }


    /*Ejercicio 6. Cifrado simple
    Crea métodos para leer una palabra, cifrarla sustituyendo vocales por el siguiente carácter, y
    mostrar el resultado.
    Objetivo: Separar entrada, procesamiento y salida en distintos métodos.*/
    //public static String cifrarPalabra(String palabra){

    //}


    /*Ejercicio 7. Calculadora de notas
    Implementa métodos para pedir tres notas, calcular la media, obtener la calificación textual
    y mostrar los resultados.
    Objetivo: Coordinar varios métodos que pasan y retornan datos entre sí. */
    public static double pedirnota(int numero){
        System.out.print("Introduzca la nota del 0 al 10: " + numero);
        return sc.nextDouble();
    }
    
    public static double media(double num1, double num2, double num3){
        return (num1 + num2 + num3) / 3; 
    }

    public static String obtenercalificacion(double media){
        if (media >= 9) {
            return "¡¡¡¡SOBRESALIENTE!!!!";
        } else if (media >= 7) {
            return "NOTABLE";
        } else if (media >= 6) {
            return "Bien";
        } else if (media >= 5){
            return "Suficiente";
        } else {
            return "insuficiente";
        }
    }

    public static void mostrarresultados(double num1, double num2, double num3, double media, String calificacion){
        System.out.println("Vamos con los resultados: ");
        System.out.println("Num1 es: " + num1);
        System.out.println("Num2 es: " + num2);
        System.out.println("Num3 es: " + num3);
        System.out.printf("Media: " + media);
        System.out.println("El resultado: " + calificacion);
    }        


    /*Ejercicio 8. Control de validación
    Crea un método que valide un número entero positivo y otro que muestre su tabla de
    multiplicar.
    Objetivo: Controlar errores y modularizar validaciones y cálculos. */


    /* Ejercicio 9. Sistema de menú modular
    Desarrolla un programa con un menú principal que llame a métodos distintos según la
    opción elegida.
    Objetivo: Diseñar programas estructurados con menús y submétodos.*/


    /* Ejercicio 10. Mini proyecto: Gestor de estudiantes modular
    Crea una clase GestorEstudiantes con métodos para mostrar un menú, registrar estudiantes,
    mostrar la lista y calcular la media del grupo. El método main solo debe llamar a menu().
    Objetivo: Simular un programa completo con responsabilidades bien divididas y un flujo modular.*/
















    
    public static void main(String[] args) {
        boolean repetir = true;
        System.out.println("Bienvenido a la calculadora ");

        do {
            System.out.println("Selecciona una opción: ");
            System.out.println("Opción 1 = Sumar ");
            System.out.println("Opción 2 = Restar ");
            System.out.println("Opción 3 = Multiplicar ");
            System.out.println("Opción 4 = Dividir ");
            System.out.println("Opción 5 = Salir");
            int operación = sc.nextInt();
            int resultado = 0;

            switch (operación) {
                case 1:
                    System.out.println("Introduce el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int num2 = sc.nextInt();
                    resultado = sumar(num1, num2);
                    System.out.println("La suma de " + num1 + " + " + num2 + "es: " + resultado);
                    break;

                case 2: 
                    System.out.println("Introduce el primer número: ");
                    int num3 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int num4 = sc.nextInt();
                    resultado = restar(num3, num4);
                    System.out.println("La resta de " + num3 + " - " + num4 + "es: " + resultado);
                    break;

                case 3:
                    System.out.println("Introduce el primer número: ");
                    int num5 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int num6 = sc.nextInt();
                    resultado = multiplicar(num5, num6);
                    System.out.println("La multiplicación de " + num5 + " * " + num6 + "es: " + resultado);
                    break;

                case 4:
                    System.out.println("Introduce el primer número: ");
                    int num7 = sc.nextInt();
                    System.out.println("Introduce el segundo número: ");
                    int num8 = sc.nextInt();
                    resultado = dividir(num7, num8);
                    System.out.println("La división de " + num7 + " / " + num8 + "es: " + resultado);
                    break;

                case 5:
                    System.out.println("Hasta aquí llegamos, bye. ");
                    repetir = false;
                    break;

                default:
                    System.out.println("Opción no valida ");
                    break;
            }
            
        } while (repetir);



        //Número mayor y número menor Ejercicio 2
        

        // Ejercicio 3


        
        //Tres métodos llamar solo ejecutarprograma  Ejercicio 4
        



        //Áreas del cuadrado, rectángulo y círculo Ejercicio 5
        

        //Cifrar palabra intercambiando letras  Ejercicio 6


        //Calcular la media y mostrar el resultado Ejercicio 7


        // Ejercicio 8



        //Ejercicio 9



        //Ejercicio 10
        
    }
}