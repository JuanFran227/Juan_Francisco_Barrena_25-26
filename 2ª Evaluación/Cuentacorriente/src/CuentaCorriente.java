/*Todos los atributos deberán estar con visibilidad privada (como es buena práctica…).
Deberá crearse un constructor que reciba un objeto Cliente y cree una CuentaCorriente
asignando un nuevo número (que no se haya asignado antes a ningún objeto
CuentaCorriente) de IBAN y el saldo inicial de 0. Para la asignación de números de IBAN
debe crearse una variable estática (atributo de clase) que sirva de contador y ayude en este
proceso.
Deberá crearse métodos Getter (no Setter) predefinidos de todos los atributos.
Se deberán crear métodos para las siguientes acciones:
● Sacar dinero
● Ingresar dinero en efectivo
● Mostrar información de la cuenta por consola
● Cambiar el titular de la cuenta
● Traspasar dinero de una cuenta a otra */
public class CuentaCorriente {

    private static long contador = 0;
    private long IBAN;
    private double Saldo;
    private Cliente titular;


    public CuentaCorriente(Cliente titular){
        this.titular = titular;
        this.Saldo = 0;
        this.IBAN = contador;
        contador++;
    }



    public void sacardinero(int retirarcantidad){
        if (Saldo >= retirarcantidad) {
            Saldo -= retirarcantidad;
            System.out.println("Has retirado " + retirarcantidad + " €");
        }else{
            System.out.println("No tienes suficiente fondo para sacar dinero. ");
        }
    }


    public void ingresardinero(double ingresarcantidad){
        Saldo += ingresarcantidad;
        System.out.println("La operación ha sido un éxito. ");
    }


    public void mostrarinformacioncuenta(){
        System.out.println("Información de la cuenta: ");
        System.out.println("IBAN: " + IBAN);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Cliente: " + titular.getnombre() + " " + titular.getapellidos());
    }


    public void cambiartitular(Cliente nuevotitular){
        titular = nuevotitular;
        System.out.println("Se ha cambiado el titular de la cuenta. ");
    }


    public void traspasardinero(CuentaCorriente otracuenta, double traspasocantidad){
        if (Saldo >= traspasocantidad) {
            Saldo = Saldo - traspasocantidad;
            otracuenta.Saldo = otracuenta.Saldo + traspasocantidad;
            System.out.println("El traspaso de dinero ha sido efecturado con éxito. ");
        }else{
            System.out.println("No se ha podido efectuar el traspaso. ");
        }   
    }

    
    //Getter y Setter de IBAN
    public long getIBAN() {
        return IBAN;
    }
    public void setIBAN(long IBAN){
        this.IBAN = IBAN;
    }


    //Getter de Saldo
    public double getSaldo() {
        return Saldo;
    }


    //Getter de Titular
    public Cliente getTitular() {
        return titular;
    }
}