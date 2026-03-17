import java.util.Scanner;

public class Cajero {
    static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {

        System.out.println(
                "Hola bienvenido al cajero DemeDinero, siga las siguientes instrucciones para realizar sus operaciones: ");
        System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("|          Cajero Automático            |");
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
        System.out.println("|          1. Consultar Saldo           |");
        System.out.println("|          2. Depositar Dinero          |");
        System.out.println("|          3. Retirar Dinero            |");
        System.out.println("|          4. Salir                     |");
        System.out.println("|_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _|");
        System.out.println();
        System.out.print("Elija una opción: ");

        int opcion = 0;
        int saldo = 100;
        int ingresar = 0;
        int retirar = 0;
        int totalingresos = 0;
        int totalretiradas = 0;
        int numeroingresos = 0;
        int numerototalretiradas = 0;
        opcion = sc.nextInt();

        
        do {
            switch (opcion) {
                case 1:
                    System.out.print("Su saldo actual es de: " + saldo + "€.");

                    break;

                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    ingresar = sc.nextInt();

                    if (ingresar <= 0) {
                        System.out.println(
                                "Debe ingresar un número mayor que 0, quien en su sano juicio ingresa 0€ o menos =/.");
                    } else {
                        saldo += ingresar;
                        totalingresos += ingresar;
                        numeroingresos += 1;
                        System.out.print("El depósito hecho es de: " + ingresar + "€.");
                    }

                    break;

                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    retirar = sc.nextInt();
                    if (retirar <= 0) {
                        System.out.println(
                                "No puedes retirar un número igual o menor que cero, si quieres dinero así no se hace =|.");
                    } else if (retirar > saldo) {
                        System.out.println("FONDOS INSUFICIENTES. No puede retirar esa cantidad porque su saldo es de: "
                                + saldo + "€.");
                    } else {
                        saldo -= retirar;
                        totalretiradas += retirar;
                        numerototalretiradas += 1;
                        System.out.print("El retiro hecho es de: " + retirar + "€ .");
                    }

                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero automático, Hasta la próxima =)");
                    System.out.println("----- Resumen de Operaciones -----");
                    System.out.println("Número total de ingresos hechos: " + numeroingresos);
                    System.out.println("Importe total ingresado: " + totalingresos + "€. ");
                    System.out.println("Número total de retiradas hechas: " + numerototalretiradas);
                    System.out.println("Importe total retirado: " + totalretiradas + "€. ");

                    break;

                default:
                    System.out.println("Usted ha pulsado mal el dígito, pulse bien si no quiere perder todo su dinero =)");
            }
            System.out.println();
        } while (opcion != 4);      
    }
}