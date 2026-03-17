import java.util.Scanner;

public class Actividad1 {
    static Scanner sc = new Scanner (System.in);
    /* 1. Programa que al pedir dos números al usuario muestre cual es el mayor o si son iguales
     Pedir una cadena, con un escáner, pedir una cadena para buscarla con escáner
    */
    public static void ejercicio1() {
        System.out.println("Pedir el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Pedir el segundo número");
        int numero2 = sc.nextInt();
        
        if (numero1>numero2){
            System.out.println("El número mayor es" + numero1);
        }
        else if(numero1<numero2){
            System.out.println("El número menor es " + numero1);
        }
        else{
            System.out.println("Los dos números son iguales");
        }
    }

    // 2. Programa que pida un número y diga si es par o impar
    public static void ejercicio2() {
        System.out.println("Escriba un número");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    
    /* 3. Programa que pida dos números al usuario y muestre el resultado de su división. 
    Si el segundo número es 0 mostrar mensaje de error.
    */
    public static void ejercicio3() {
        System.out.println("Pon el primer número");
        double numero1 = sc.nextDouble();
        System.out.println("Pon el segundo número");
        double numero2 = sc.nextDouble();

        if (numero2 == 0){
            System.out.println("ERROR");
        }else{
            double resultado = numero1/numero2;
            System.out.println("El resultado de la división es" + resultado);
        }
    }


    /* 4. Construye un programa que pida dos números al usuario. Debe calcular el resultado de
    elevar el primero (base) al segundo (exponente) teniendo en cuenta lo siguiente:
    o Si el exponente es cero el resultado es 1
    o En cualquier otro caso calcula la potencia (Math.pow(base,exponente) es la función que
    calcula la potencia)
    */
    public static void ejercicio4() {
        System.out.println("Pon el primer número(base)");
        int numero1 = sc.nextInt();
        System.out.println("Pon el segundo número(exponente)");
        int numero2 = sc.nextInt();
        double resultado;
        if(numero2 == 0){ //si el exponente es 0 resulstado 1
            resultado=1;
        }else{ // calcular el resultado de elevar al exponente
            resultado = Math.pow(numero1,numero2);
        }
        System.out.println(numero1 + "elevado a" + numero2 + "es" + resultado);
    }

    /* 5. Construye un programa que exprese si un triángulo es isósceles, equilátero o escaleno y
    si es rectángulo. Para ello debe recibir por teclado 3 valores correspondiente a la medida de sus
    lados.
     */
    public static void ejercicio5() {
        System.out.println("Primer lado del triángulo");
        int a = sc.nextInt();
        System.out.println("Segundo lado del triángulo");
        int b =sc.nextInt();
        System.out.println("Tercer lado del triángulo");
        int c = sc.nextInt();
        //Comprobamos que el triángulo sea válido
        if (a + b > c && a + c > b && b + c > a);
        
        // Según sus lados
        if (a == b && c == b){
            System.out.println("El triángulo es equilátero");
        }else if(a == b || a == c || b == c){
            System.out.println("el triángulo es isósceles");
        }else{
            System.out.println("El triángulo es escaleno");
        } 

        //Ver si es rectángulo con el "Teorema de Pitágoras" "a2 + b2 = c2"
        int a2 = a * a;
        int b2 = b * b; 
        int c2 = c * c;
        if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2){
            System.out.println("Además, el triángulo es rectángulo");
        }else{
            System.out.println("Los lados no forman parte de un triángulo");
        }


    }

    /* 6. Un instituto está organizando un viaje y te piden que construyas un programa que
    calcule el coste total del viaje y lo que le supone a cada alumno en función de lo siguiente:
    o Si llegan a 50 alumnos o más, deberán pagar 40€ por alumno.
    o De 30 a 49 alumnos, deberán pagar 48€ por alumno.
    o De 20 a 29 alumnos, deberán pagar 56€ por alumno.
    o Menos de 20 alumnos, deberán abonar un total de 2000 euros en total. 
    */
    public static void ejercicio6() {
        System.out.println("Introduce número de alumnos");
        int alumnos = sc.nextInt();

        if (alumnos >= 50){
            System.out.println("Los alumnos deben pagar 40€. El coste es" + (alumnos * 40));
        }else if (alumnos >= 30 && alumnos <= 49){
            System.out.println("Los alumnos deben pagar 48€. El coste es" + (alumnos * 48));
        }else if (alumnos >= 20 && alumnos <= 29){
            System.out.println("Los alumnos deben pagar 56€. El coste es" + (alumnos * 56));
        }else if (alumnos >0){
            System.out.println("Los alumnos deben pagar 2000€. El coste es" + (2000 / alumnos));
        }else{
            System.out.println("El número de alumnos no es correcto");
        }

        
 
    }


    public static void main(String[] args) throws Exception {

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();

    }
}
