/*Nombre: String
● Interés: double (ratio de interés)
● Listado de Cuentas Corrientes: Array de CuentaCorriente
● Número de Trabajadores: int
Crea constructores y métodos get para todos sus atributos. Además, la clase Banco será
capaz de realizar las siguientes acciones:





● Devolver el Cliente que posee más dinero en el banco.
● Devolver el Cliente que posee menos dinero en el banco.
● Realizar un ingreso en una de sus cuentas (a través del IBAN).
● Realizar una retirada de dinero en una de las cuentas corrientes (a través del IBAN).
● Realizar una transferencia de una cuenta corriente a otra (a través del IBAN de
ambas).
● Devolver un array con las cuentas corrientes ordenadas de más dinero a menos
dinero.
● Eliminar del Banco las cuentas que sean inferior a cierta cantidad de dinero
(introducida por parámetro).
● Dar el total de dinero que una determinado cliente (a través del Cliente) posee en las
cuentas que tiene en el banco. En el caso de que el Cliente no tenga cuentas se le
devolverá 0.
● Sortear una cantidad de dinero (introducida por parámetro) entre las Cuentas del
Banco, la CuentaCorriente ganadora recibirá un ingreso del valor del premio.
● Declararse en bancarrota: esto consistirá en poner el saldo de sus cuentas corrientes
a cero, despedir a todos sus trabajadores, y pedir disculpas por consola.
● Realiza los métodos que consideres oportunos en la clase del ejercicio anterior
CuentaCorriente. */
//En los constructores parametrizados le entra un parámetro de tamaño de el array de cuentas corrientes. 

public class Banco {
    private String nombre;
    private double ratiodeinteres = 0.1;
    private CuentaCorriente[] cuentas;
    private int numeroDeTrabajadores;

    public Banco(){
        this.nombre = "";
        this.ratiodeinteres = 0.1;
        this.numeroDeTrabajadores = 0;
        this.cuentas = new CuentaCorriente[5];
    }


    public void Ibercaja(String nombre, double ratiodeinteres, int numeroDeTrabajadores, CuentaCorriente[] cuentas){
        this.nombre = nombre;
        this.ratiodeinteres = ratiodeinteres;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }


    public void Caixa(String nombre, double ratiodeinteres, int numeroDeTrabajadores, CuentaCorriente[] cuentas){
        this.nombre = nombre;
        this.ratiodeinteres = ratiodeinteres;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.cuentas = cuentas;
    }


    //● Eliminar una determinada (a través del IBAN) cuenta del banco.
    public boolean eliminarCuentaCorriente(long IBAN){
        for(int i = 0; i < cuentas.length; i++){
            if (cuentas[i] != null && cuentas[i].getIBAN() == IBAN) {
                cuentas[i] = null;
                return true;
            }
        }
        return false;
    }

    
    //● Crear una nueva cuenta (a través del Cliente) en el banco.
    public boolean crearCuentaCorriente(Cliente nuevocliente){
        for(int i = 0; i < cuentas.length;){
            if (cuentas[i] == null) {
                cuentas[i] = new CuentaCorriente(nuevocliente);
                break;
            }
            return true;
        }
        return false;
    }

    
    //● Cambiar de titular una cuenta (a través del IBAN y el nuevo Cliente propietario).
    public boolean cambiartitularcuenta(long IBAN, Cliente nuevotitular){
        for(int i = 0; i < cuentas.length;){
            if (cuentas[i] != null && cuentas[i].getIBAN() == IBAN){
                cuentas[i].cambiartitular(nuevotitular);
                return true;
            }
        }
        return false;
    }


    /*● Pagar intereses: ingresa a todas las cuentas del banco lo que le pertenece por los
    intereses, ejemplo si el interés del banco es 0.10 el banco tendrá que pagar un 10%
    a cada cuenta del saldo que posee.*/
    public void pagarintereses(double ratiodeinteres){
        for(int i = 0; i < cuentas.length; i++){
            if (cuentas[i] != null) {
                System.out.println("El ratio de intereses es: " + ratiodeinteres);
                cuentas[i].ingresardinero(cuentas[i].getSaldo() * ratiodeinteres);
                System.out.println("Se han hecho los pagos de interés a: " + cuentas[i].getTitular().getnombre());
                System.out.println("El saldo de la cuenta es: " + cuentas[i].getSaldo());
            }
        }
    }


    /*● Fusionar dos bancos (método estático): con lo que el nombre pasará a ser la
    concatenación de ambos nombres con una “ y “ en medio que los separe, los
    trabajadores se sumarán, los listados de cuentas corrientes se unirán y el interés
    pasará a ser la media. Este método tendrá que devolver el Banco resultante de la
    fusión.*/
    public static void Fusionar(Banco banco1, Banco banco2){
        
    }


    /*● Mostrar los datos del banco por consola: Nombre del banco, Número de cuentas
    corrientes y número de trabajadores.*/
    public void mostrarinformacionbanco(Banco banco){
        System.out.println("El nombre del banco es: " + getnombre());
        System.out.println("Su número de cuentas es: " + getCuentaCorriente());
        System.out.println("La cantidad de trabajadores es: " + getnumerotrabajadores());
    }







    //Getter de nombre
    public String getnombre(){
        return nombre;
    }

    //Getter de radiointereses
    public double getratio(){
        return ratiodeinteres;
    }

    //Getter de numerotrabajadores
    public int getnumerotrabajadores(){
        return numeroDeTrabajadores;
    }

    //Getter de cuentascorrientes
    public CuentaCorriente[] getCuentaCorriente(){
        return cuentas;
    }
}