import java.util.Scanner; 
import java.lang.Math;
public class Actividad2 {
    
    
    //Definimos el main con el escáner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        //Pedimos que nos enseñe el nombre en la consola
        System.out.println("Introduzca su nombre");
        String nombre = sc.next();
        System.out.println("Su nombre es" + nombre);

        //Para las operaciones de suma, resta, multiplicación y división
        System.out.println("Introduce el primer número" );
        int numero1 = sc.nextInt();
        
        System.out.println("Introduce el segundo número" );
        int numero2 = sc.nextInt();
        
        //Definimos las operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        //Para que nos lo muestre en consola
        System.out.println("Suma" + suma);
        System.out.println("Resta" + resta);
        System.out.println("multiplicación" + multiplicacion);


        //La raíz cuadrada
        System.out.print("Poner un número:");
        double numero = sc.nextDouble();

        double raiz = Math.sqrt(numero);
        System.out.println("La raíz cuadrada es" + raiz);
        
        
        //Potencia y número 
        System.out.println("Introduzca un número");
        double base = sc.nextDouble();
        System.out.println("Introduce una potencia");
        double potencia = sc.nextDouble();
        double resultadoPotencia = Math.pow(base, potencia);
        System.out.println("El resultado es: " + resultadoPotencia);


        //Pedir radio de un círculo y calcular su área (A=pi*r^2)
        System.out.println("Introduce el radio del círculo");
        Double radiocirculo =sc.nextDouble();
        Double area = Math.PI * Math.pow(radiocirculo, 2);
        System.out.println("El área es" + area);
        
        

        

        // Pedir el radio de una circunferencia y calcular su longitud.(L=2+pi*r)
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        // longitud
        double longitud = 2 * Math.PI * radio;

        // Resultado
        System.out.println("La longitud de la circunferencia es: " + longitud);
       



        //Pedir un password y comprobar si es igual que un String definido en el programa. Enseñar el resultado por pantalla.
        String passwordcorrect = "1234";

        System.out.println("Pon la contraseña");
        String password = sc.nextLine();

        if (password.equals(passwordcorrect)){
            System.out.println("La contraseña es correcta");

        } else{
            System.out.println("La contraseña no es correcta");
        }


        //Pedir una frase y enseñar por pantalla, la longitud, la primera y última letra.
        System.out.print("Escribe una frase: ");
        String f = sc.nextLine();

        System.out.println("Longitud: " + f.length());
        System.out.println("Primera letra: " + f.substring(0, 1));
        System.out.println("Última letra: " + f.substring(f.length() - 1));



        /*Pedir por consola o pantalla una frase que contenga la palabra "amigo", 
        como por ejemplo: “Hola amigo ¿cómo estás?”. 
        El programa deberá enseñar el substring "amigo" extraído de la cadena introducida por consola.
        */
        String j = sc.nextLine();
            System.out.println(j.substring(j.indexOf("amigo"),j.indexOf("amigo")+ 5));
            
    
        sc.close();
    }         
     

}


