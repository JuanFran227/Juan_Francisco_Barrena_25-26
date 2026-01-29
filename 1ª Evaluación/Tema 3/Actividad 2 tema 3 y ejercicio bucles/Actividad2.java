import java.util.Scanner;

public class Actividad2 {
    static Scanner sc = new Scanner (System.in);
    // 1. Escribe un programa que pida un número y diga si es o no múltiplo de 3
    public static void ejercicio1(){
        System.out.println("Pedir un número");
        int numero = sc.nextInt();

        if (numero % 3 == 0){
            System.out.println("El número" + numero + "es múltiplo de 3");
        }else{
            System.out.println("El número" + numero + "no es múltiplo de 3");
        }
            
    }

    // 2. Escribe un programa que lee por teclado tres números enteros y calcula y muestra el mayor de los tres.
    public static void ejercicio2(){
        System.out.println("Pon el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Pon el segundo número");
        int numero2 = sc.nextInt();
        System.out.println("Pon el tercer número");
        int numero3 = sc.nextInt();


        if (numero1>numero2 && numero1>numero3){
            System.out.println(numero1 + "es el mayor");
        }else if(numero2>numero1 && numero2>numero3){
            System.out.println(numero2 + "es el mayor");
        }else {
            System.out.println(numero3 + "es el mayor");
        }

        
    }
            
       

    /* 3. Escribe un programa que lea por teclado tres números enteros H, M, S correspondientes
    a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.
    Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será
    mayor o igual que cero y menor que 24. El valor válido para los minutos y segundos estará
    comprendido entre 0 y 59 ambos incluidos.*/

    public static void ejercicio3(){
        System.out.println("Poner la hora (0-23)");
        int H = sc.nextInt();
        System.out.println("Poner el minuto (0-59)");
        int M = sc.nextInt();
        System.out.println("Poner el segundo (0-59)");
        int S = sc.nextInt();

        if (H >= 0 && H < 24 && M >= 0 && M < 60 && S >= 0 && S < 60 ){
            System.out.println("La hora es " + H + ":" + M + ":" + S);
        }else{
            System.out.println("La hora no es correcta");
        }
        
    }

    /* 4. Escribe un programa que pida por teclado un número entre 0 y 10, y muestre en pantalla
    el nombre en letras de ese número. Se debe controlar que se introduzca un número válido.*/
    public static void ejercicio4(){
        
        System.out.println("Introduce un número entre 0 y 10: ");
        int numero = sc.nextInt();

        String nombreNumero;

        if (numero < 0 || numero > 10) {
            System.out.println("Número no válido. Debe estar entre 0 y 10.");
        } else {

            switch (numero) {
                case 0:
                nombreNumero = "cero";
                break;
            case 1:
                nombreNumero = "uno";
                break;  
            case 2:
                nombreNumero = "dos";
                break;
            case 3:
                nombreNumero = "tres";
                break;
            case 4:
                nombreNumero = "cuatro";
                break;
            case 5:
                nombreNumero = "cinco";
                break;
            case 6:
                nombreNumero = "seis";
                break;
            case 7:
                nombreNumero = "siete";
                break;
            case 8:
                nombreNumero = "ocho";
                break;
            case 9:
                nombreNumero = "nueve";
                break;
            case 10:
                nombreNumero = "diez";
                break;
            default:
            nombreNumero = "noseconoce";
            break;
            }
            System.out.println("El número " + numero + "en letra es " + nombreNumero);
        }
    }





    /* 5. Escribe un programa que realice lo contrario que el anterior, es decir pide un número en
    letras y enseña un número.
    Aclaración: No es lo mismo la cadena "Uno" que "uno" o que "UNO", por lo tanto, para que el
    programa funcione correctamente deberías pasar todas las letras del nombre del número a
    mayúsculas o a minúsculas. Investiga cuál es la función del objeto String que nos permite realizar ese
    cambio.*/

    public static void ejercicio5(){
        System.out.println("Introduce un número en letras entre 'cero' y 'diez': ");

        String numeroLetras = sc.nextLine();
        numeroLetras = numeroLetras.toLowerCase();



        int numero = -1; // Se inicia con un negativo

        switch (numeroLetras) {
            case "cero":
            numero = 0;
            break;
            case "uno":
            numero = 1;
            break;
            case "dos":
            numero = 2;
            break;
            case "tres":
            numero = 3;
            break;
            case "cuatro":
            numero = 4;
            break;
            case "cinco":
            numero = 5;
            break;
            case "seis":
            numero = 6;
            break;
            case "siete":
            numero = 7;
            break;
            case "ocho":
            numero = 8;
            break;
            case "nueve":
            numero = 9;
            break;
            case "diez":
            numero = 10;
            break;
        default:
            System.out.println("El número no se permite. Tiene estar entre  el 'cero' y el 'diez'.");
            break;
        }

        if (numero != -1) {
            System.out.println("El número  es: " + numero);
        }
    }

    /* 6. : Escribe un programa que lea una variable entera mes y compruebe si el valor
    corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se
    mostrará además el nombre del mes.
    Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.*/

    public static void ejercicio6(){
        System.out.print("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();


        if (mes < 1 || mes > 12) {
        System.out.println("El número del mes no es válido. Debe estar entre 1 y 12.");
        } else {

        String nombreMes;
        int dias;
        switch (mes) {
        case 1:
            nombreMes = "Enero";
            dias = 31;
            break;
        case 2:
            nombreMes = "Febrero";
            dias = 28;
            break;
        case 3:
            nombreMes = "Marzo";
            dias = 31;
            break;
        case 4:
            nombreMes = "Abril";
            dias = 30;
            break;
        case 5:
            nombreMes = "Mayo";
            dias = 31;
            break;
        case 6:
            nombreMes = "Junio";
            dias = 30;
            break;
        case 7:
            nombreMes = "Julio";
            dias = 31;
            break;
        case 8:
            nombreMes = "Agosto";
            dias = 31;
            break;
        case 9:
            nombreMes = "Septiembre";
            dias = 30;
            break;
        case 10:
            nombreMes = "Octubre";
            dias = 31;
            break;
        case 11:
            nombreMes = "Noviembre";
            dias = 30;
            break;
        case 12:
            nombreMes = "Diciembre";
            dias = 31;
            break;
        default:
            nombreMes = "Desconocido";
            dias = 0;
            break;
        }
        // Mostrar el resultado

    System.out.println("El mes de " + nombreMes + " tiene " + dias + " días.");
    }
}
    

    /* 7. : Escribe un programa que pida la nota de las tres evaluaciones, y si están aprobadas
    realizar la media para calcular la nota final. Evaluación aprobada >= 5. Si no, escribe que evaluación
    debe recuperar.*/
    public static void ejercicio7(){
        System.out.print("Introduce la nota de la primera evaluación: ");
        double eval1 = sc.nextDouble();
        System.out.print("Introduce la nota de la segunda evaluación: ");
        double eval2 = sc.nextDouble();
        System.out.print("Introduce la nota de la tercera evaluación: ");
        double eval3 = sc.nextDouble();

        if ((eval1 >= 5) && (eval2 >= 5) && (eval3 >= 5)) {

        double media = (eval1 + eval2 + eval3) / 3;
        System.out.println("Todas las evaluaciones están aprobadas. La nota final es: " + media);
        } else {
        System.out.println("Debes recuperar las siguientes evaluaciones:");
        if (!(eval1 >= 5)) {
        System.out.println("Primera evaluación (Nota: " + eval1 + ")");
        }
        if (!(eval2 >= 5)) {
        System.out.println("Segunda evaluación (Nota: " + eval2 + ")");
        }
        if (!(eval3 >= 5)) {
        System.out.println("Tercera evaluación (Nota: " + eval3 + ")");
        }
    }
}
     
    


    /* 8. Escribe un programa que calcule el sueldo de un trabajador. Debe pedir el número de
    horas trabajadas este mes. Las primeras 150 horas se pagan a 10€ y a partir de ahí, las restantes
    horas que superen las 150 se pagan a 20€. Debe aparecer por pantalla el total del sueldo.*/
    public static void ejercicio8(){
        final int TARIFA_NORMAL = 10;
        final int TARIFA_EXTRA = 20;
        final int HORAS_MAXIMAS_NORMALES = 150;

        double sueldototal;
        System.out.println("Pon el número de horas trabajadas");
        int horastrabajadas = sc.nextInt();

        if (horastrabajadas <= HORAS_MAXIMAS_NORMALES) {

            sueldototal = horastrabajadas * TARIFA_NORMAL;
        } else {


        int horasExtras = horastrabajadas - HORAS_MAXIMAS_NORMALES;
        sueldototal = (HORAS_MAXIMAS_NORMALES * TARIFA_NORMAL) + (horasExtras * TARIFA_EXTRA);
        }

        System.out.println("El sueldo total es " + sueldototal + "€");
    }
    

    /* 9. Escribe un programa que diga si un año es bisiesto. No deber permitir aceptar años
    negativos. Un año es bisiesto si cumple una de las siguientes reglas:
    1. Divisible entre 4, divisible entre 100 y divisible entre 400.
    2. Divisible entre 4, NO divisible entre 100.*/
    public static void ejercicio9(){
        System.out.print("Introduce un año (no negativo): ");
        int anio = sc.nextInt();

        if (anio < 0) {
            System.out.println("El año no puede ser negativo. Por favor, introduce un año válido.");
        } else {
            if ((anio % 4 == 0 && anio % 100 == 0 && anio % 400 == 0)
            || (anio % 4 == 0 && anio % 100 != 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
        System.out.println("El año " + anio + " no es bisiesto.");
        }
    }
    }
    public static void main(String[] args) throws Exception{

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        
        
        /*int i=0;
        while (i<20){
            System.out.println("Estamos en la iteración: " + i);
            i++; //i = i + 1;
        } 

        i=0;
        do{
            System.out.println("Estamos en la iteración: " + i);
            i++;
        }while(i<20);*/
    }
}
