import java.util.Random;
import java.util.Scanner;

public class Bucles{
    static Scanner sc = new Scanner(System.in);
    
    /*Realizar un programa que imprima en pantalla los números del 1 al 100. (Debes hacerlo
    con las tres estructuras iterativas vistas: while, do while y for).*/
    
    public static void ejercicio1(){
    /*while */
    int i = 1;
    while (i <= 100) {
        System.out.println(i + " ");
        i++;
    }

    /*do while */
    int j = 1;
    do {
        System.out.println(j + " ");
        j++;
    } while (j <= 100);

    
    /*for */
    for(int h = 1; h <= 100; h++){
        System.out.println(h + " ");
        h++;
    }
}


    /*Escribir un programa que solicite un valor positivo y nos muestre desde 1 hasta el valor
    ingresado de uno en uno. */

    public static void ejercicio2(){
        
        System.out.println("Pon un número");
        int numero = sc.nextInt();
        if (numero >= 1) {
            for(int i = 1; i < numero; i++){
                System.out.println(i);
            }
        } else {
            System.out.println("El número no es positivo");
        }
      
    }
    
    /* Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre
    posteriormente la suma de los valores ingresados y su promedio.*/
    
    
    public static void ejercicio3(){
        int suma = 0;
        for(int i=0;i<10;i++){
            System.out.println("Pon un número ");
            int valor = sc.nextInt();
            suma = suma + valor;
        }
        System.out.println("La suma es " + suma);
        System.out.println("La media es " + suma/10);

    }

    /*: Diseña una aplicación o programa que consista en lo siguiente:
    o Guarda en una variable tu nombre.
    o Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca por teclado.
    o El programa finaliza cuando el usuario adivina tu nombre. Sino el programa debe continuar
    pidiendo al usuario que lo intente otra vez. 
     */
    
    public static void ejercicio4(){
        String nombre = "Juan Fran";
        String intento = " ";
        while (!intento.equalsIgnoreCase(nombre)) {
            System.out.print("Pon mi nombre ");
            intento = sc.nextLine();
        }
        if(!intento.equalsIgnoreCase(nombre)){
            System.out.println("El nombre no es correcto, pregúntame cual es ");
        }
        System.out.println("Muy bien, mi nombre es: " + nombre);
        }


    /*: Diseña una aplicación que simule la tirada de dos dados y muestre al usuario el resultado
    de la tirada. Si los dos dados tienen el mismo número debe mostrar un mensaje indicando que el
    resultado es el mismo. La aplicación se debe repetir hasta que el usuario indique que no quiere tirar
    más (preguntando por ‘s’ o ‘n’, o “si” o “no”).
    */

    public static void ejercicio5(){
        Random random = new Random();
        String respuesta;

        do{ // Poner valores para los dados
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            System.out.println("El resultado de dado 1 es: " + dado1);
            System.out.println("El resultado de dado 2 es: " + dado2);
        
            //Comprobar si son iguales
            if(dado1 == dado2){
                System.out.println("Los dados tienen el mismo número ");
            }
            //Para que el ususario vuelva a tirar
            System.out.println("Vuelve a tirar ");
            respuesta = sc.nextLine().trim().toLowerCase();

        } while(respuesta.equals("s") || respuesta.equals("si"));
        
        
    }

    /* Realizar un juego para adivinar un número. Para ello primero, el programa debe guardar
    un número en una variable y el usuario debe introducir números hasta acertarlos. Para darle pistas
    al usuario se le indicará “mayor” o “menor” según sea mayor o menor con respecto al número
    guardado. El proceso termina cuando el usuario acierta.
    */

    public static void ejercicio6(){
        int numerosecreto = (int) (Math.random() * 100) + 1;
        int intento = 0;
        
        System.out.println("Quiero jugar a un juego ");
        System.out.println("Estoy pensando en un número aciértalo");

        do{
            System.out.println("Introduce un número ");
            intento = sc.nextInt();
            

            if (intento < numerosecreto){
                System.out.println("El número es mayor ");
                
            }else if(intento>numerosecreto){
                System.out.println("El número es menor ");
            }else{
                System.out.println("ENHORABUENA Número correcto, que es " + intento);
            }

        } while (intento != numerosecreto);

    }

    /* Diseña una aplicación que simule un reloj digital que muestre la hora sin parar. Debe
    esperar un segundo real para darle más realismo. Pasos:
    o Pide al usuario que introduzca la hora y los minutos.
    o Inicializa el reloj a esa hora con esos minutos y 0 segundos.
    o Cada vez que transcurra un segundo incrementa la hora comprobando si hay cambio de
    minuto y hora
    o Muéstralo por pantalla.
    */

    public static void ejercicio7(){
        System.out.print("Introduce la hora 0-23 ");
        int hora = sc.nextInt();

        System.out.print("Introduce los minutos 0-59 ");
        int minutos = sc.nextInt();

        int segundos = 0;

        if (hora<0 || hora>23 || minutos<0 || minutos>59){
            System.out.println("La hora no es correcta ");
            return;
        }
        System.out.println("\nReloj iniciado...\n");


        while (true) {
            //Se muestra la hora del reloj
            System.out.printf("%02d:%02d:%02d\\r", hora, minutos, segundos);
            System.out.flush();

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Fallo en pausar el reloj ");
            }

            segundos++;
            if (segundos == 60){
                segundos = 0; 
                minutos++;
                if (minutos == 60){
                    minutos = 0;
                    hora++;
                    if(hora == 24){
                        hora = 0;
                    }
                }
            }
        }
    }

    /* Escriba un programa que calcule el factorial de un número. El factorial de un número es
    igual al producto de todos los números enteros positivos desde 1 hasta dicho número.*/

    public static void ejercicio8(){
        System.out.println("Ponga un número entero positivo ");
        int numero = sc.nextInt();
        long factorial = 1; //long por si el factorial es grande

        if(numero<0){
            System.out.println("El número es menor que cero y por ello es negativo ");
        } else {
            for(int i = 1; i <= numero; i++){
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + "es " + factorial);
        }
    }

    /* : Escriba un programa que dibuje una escalera de asteriscos. La altura de la escalera se lee
    por teclado. Ejemplo: Si introducimos un 5 nos queda:
    *
    **
    ***
    ****
    *****
    Posteriormente hacer lo mismo, pero con la pirámide invertida.*/

    public static void ejercicio9(){
        System.out.print("Pon la altura de la escalera de asteriscos ");
        int altura = sc.nextInt();
        //escalera normal
        System.out.println("\nEscalera normal");
        for(int i = 1; i <= altura; i++){
            for (int f = 1; f <= i; f++){
                System.out.print("*");
            }
            System.out.println(""); //Salto de línea
        }
        // escalera invertida
        System.out.println("\nPirámide invertida ");
        for(int i = altura; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(""); //salto de línea
        }
    }


    public static void main(String[] args){
        //ejercicio1();
        ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
    }
}