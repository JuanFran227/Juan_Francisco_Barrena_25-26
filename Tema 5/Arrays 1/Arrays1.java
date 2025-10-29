import java.util.Scanner;

public class Arrays1 {

    static Scanner sc = new Scanner(System.in);

    /*Realiza un programa que pida al usuario un número natural n,
    a partir de ese número le pediremos n veces que nos
    introduzca otros números que almacenaremos en un array a y
    mostraremos por pantalla.
     */
    public static void Ejercicio1(){
        System.out.println("Pon un número entero positivo ");
        int[] valores = new int [6];
        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;
        valores[3] = 4;
        valores[4] = 5;
        valores[5] = 6;
        
        for(int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

    }

    /*Realiza un programa que teniendo un array relleno con
    valores a de tamaño 5 (no es necesario que los valores los
    introduzca el usuario) realice una copia del mismo en otra
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
    (exceptuando el -1). */
    public static void Ejercicio3(){
        
        
    }



    /*Realiza un programa que pida al usuario un array a de 10
    elementos y muestre por pantalla un array b que contenga los
    elementos al revés, finalmente muestra por pantalla el array b. */
    public static void Ejercicio4(){

    }


    /*Realiza un programa que pida al usuario un conjunto de
    números para un array a de 8 elementos y muestre por
    pantalla un array b que solo contenga los elementos impares.
    */
    public static void Ejercicio5(){

    }


    public static void Ejercicio6(){

    }


    public static void Ejercicio7(){

    }


    public static void Ejercicio8(){

    }


    public static void Ejercicio9(){

    }



    public static void Ejercicio10(){
        
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
    //Ejercicio9();
    //Ejercicio10();
    //Ejercicio11();
    //Ejercicio12();
    //Ejercicio13();
    //Ejercicio14();
    //Ejercicio15();
    //Ejercicio16();
    //Ejercicio17();

    }
}




