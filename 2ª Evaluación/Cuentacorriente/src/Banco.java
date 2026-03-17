import java.util.Random;

public class Banco {
    private String nombre;
    private double ratiodeinteres;
    private CuentaCorriente[] cuentas;
    private int numeroDeTrabajadores;
    private int tamañoCC;


    public Banco(){
        this.nombre = "";
        this.ratiodeinteres = 0.1;
        this.numeroDeTrabajadores = 0;
        this.cuentas = new CuentaCorriente[10];
    }


    public void Banco1(String nombre, double ratiodeinteres,int tamañoCC, int numeroDeTrabajadores){
        this.nombre = nombre;
        this.ratiodeinteres = ratiodeinteres;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.cuentas = new CuentaCorriente[tamañoCC];
    }


    public void Banco2(String nombre, int tamañoCC, double ratiodeinteres, int numeroDeTrabajadores){
        this.nombre = nombre;
        this.ratiodeinteres = ratiodeinteres;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.cuentas = new CuentaCorriente[tamañoCC];
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
        for(int i = 0; i < cuentas.length; i++){
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


    /*● Fusionar dos bancos método estático: con lo que el nombre pasará a ser la
    concatenación de ambos nombres con una “ y “ en medio que los separe, los
    trabajadores se sumarán, los listados de cuentas corrientes se unirán y el interés
    pasará a ser la media. Este método tendrá que devolver el Banco resultante de la
    fusión.*/
    public static Banco Fusionar(Banco banco1, Banco banco2){
        Banco bancofusionado = new Banco();
        bancofusionado.nombre = banco1.nombre + " y " + banco2.nombre;

        bancofusionado.numeroDeTrabajadores = banco1.numeroDeTrabajadores + banco2.numeroDeTrabajadores;
        
    }


    /*● Mostrar los datos del banco por consola: Nombre del banco, Número de cuentas
    corrientes y número de trabajadores.*/
    public void mostrarinformacionbanco(Banco banco){
        System.out.println("El nombre del banco es: " + getnombre());
        System.out.println("Su número de cuentas es: " + getCuentaCorriente());
        System.out.println("La cantidad de trabajadores es: " + getnumerotrabajadores());
    }



    //● Devolver el Cliente que posee más dinero en el banco.
    public Cliente clienteconmasdinero(){
        Cliente masRico = null;
        double maxsaldo = Double.MIN_VALUE;

        for(int i = 0; i < cuentas.length; i++){
            if (cuentas[i] != null){
                if (cuentas[i].getSaldo() > maxsaldo) {
                    maxsaldo = cuentas[i].getSaldo();
                    masRico = cuentas[i].getTitular();
                }
            }  
        }
        return masRico;
    }



    //● Devolver el Cliente que posee menos dinero en el banco.
    public Cliente clienteconmenosdinero(){
        Cliente menosRico = null;
        double minsaldo = Double.MAX_VALUE;

        for(int i = 0; i < cuentas.length; i++){
            if (cuentas[i] != null) {
                if (cuentas[i].getSaldo() < minsaldo) {
                    minsaldo = cuentas[i].getSaldo();
                    menosRico = cuentas[i].getTitular();
                }
            }
        }
        return menosRico;
    }



    //● Realizar un ingreso en una de sus cuentas (a través del IBAN).
    public boolean ingresardinero(long IBAN){
        for(int i = 0; i < cuentas.length; i++){
            if (cuentas[i] != null && cuentas[i].getIBAN() == IBAN) {
                System.out.println("¿Cuánta cantidad quieres ingresar?");
                double cantidad = 0;     
                cuentas[i].ingresardinero(cantidad);
                System.out.println("Se ha realizado un ingreso en la cuenta con IBAN: " + IBAN);
                System.out.println("El saldo de la cuenta es: " + cuentas[i].getSaldo());
                return true;
            }
        }
        return false;
    }



    //● Realizar una retirada de dinero en una de las cuentas corrientes (a través del IBAN).
    public boolean retirardinero(long IBAN){
        for(int i = 0; i < cuentas.length; i++){
            if (cuentas[i] != null && cuentas[i].getIBAN() == IBAN) {
                System.out.println("¿Cuánta cantidad de dinero quieres retirar?");
                double cantidad = 0;
                cuentas[i].sacardinero(cantidad);
                System.out.println("Se ha realizado una retirada en la cuenta con IBAN: " + IBAN);
                System.out.println("El saldo de la cuenta es: " + cuentas[i].getSaldo());
                return true;
            }
        }
        return false;
    }



    //● Realizar una transferencia de una cuenta corriente a otra (a través del IBAN de ambas).
    public boolean transferencia(long IBAN1, long IBAN2){
        for(int i = 0; i < cuentas.length; i++){
            if (cuentas[i] != null && cuentas[i].getIBAN() == IBAN1) {
                System.out.println("¿Cuanta cantidad vas a transferir?");
                double cantidad = 0;
                cuentas[i].getTitular().getnombre();
                cuentas[i].sacardinero(cantidad);
                System.out.println("Se ha realizado la transferencia a la cuenta: " + IBAN2);
                System.out.println("El saldo de la cuenta es: " + cuentas[i].getSaldo());
                return true;
            }
        }
        return false;
    }
    

    //REVISAR
    //● Devolver un array con las cuentas corrientes ordenadas de más dinero a menos dinero.
    public CuentaCorriente[] devolverarray(CuentaCorriente[] cuentas){
        CuentaCorriente[] ordenada = new CuentaCorriente[cuentas.length];
        int contador = 0;

        for(int i = 0; i < cuentas.length;){
            if (cuentas[i] != null) {
                ordenada[i] = cuentas[i];
                contador++;
            }
        }

        for(int i = 0; i < contador - 1; i++){
            for(int j = 0; j < contador - 1 - i; j++){
                if (ordenada[j].getSaldo() > ordenada[j + 1].getSaldo()) {
                    CuentaCorriente aux = ordenada[j];
                    ordenada[j] = ordenada[j+1];
                    ordenada[j+1] = aux;
                }
            }
        }

        CuentaCorriente[] resultado = new CuentaCorriente[contador];
        for(int i = 0; i < contador; i++){
            resultado[i] = ordenada[i];
        }
        return resultado;
    }


    //● Eliminar del Banco las cuentas que sean inferior a cierta cantidad de dinero (introducida por parámetro).
    public boolean eliminarcuentasinferiore(double cantidad){
        for(int i = 0; i <cuentas.length; i++){
            if (cuentas[i] != null && cuentas[i].getSaldo() < cantidad) {
                cuentas[i] = null;
                return true;
            }
        }
        return false;
    }


    /*● Dar el total de dinero que una determinado cliente (a través del Cliente) posee en las
    cuentas que tiene en el banco. En el caso de que el Cliente no tenga cuentas se le
    devolverá 0.*/
    public double totaldelCliente(Cliente cliente){
        if (cliente == null || cliente.getDNI() == null) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] != null) {
                Cliente titular = cuentas[i].getTitular();
                if (titular != null && cliente.getDNI().equals(titular.getDNI())) {
                    total += cuentas[i].getSaldo();
                }
            }
        }
        return total;
    }


    //● Sortear una cantidad de dinero (introducida por parámetro) entre las Cuentas del Banco, la CuentaCorriente ganadora recibirá un ingreso del valor del premio.
    public void sortearPremio(double premio){
        Random rd = new Random();
        int ganador = rd.nextInt();
        cuentas[ganador].ingresardinero(premio);
        System.out.println("El premio ha sido transferido a la cuenta con el IBAN. " + cuentas[ganador].getIBAN());
        System.out.println("El saldo de la cuenta es: " + cuentas[ganador].getSaldo());
    }


    //● Declararse en bancarrota: esto consistirá en poner el saldo de sus cuentas corrientes a cero, despedir a todos sus trabajadores, y pedir disculpas por consola.
    public void bancarrota(){
        for(int i = 0; i < cuentas.length; i++){
            if (cuentas[i] != null) {
                cuentas[i].sacardinero(cuentas[i].getSaldo());
                cuentas[i].getTitular().getnombre();
                System.out.println("Se ha realizado una bancarrota en la cuenta con IBAN: " + cuentas[i].getIBAN());
                System.out.println("El saldo de la cuenta es: " + cuentas[i].getSaldo());
                System.out.println("El titular de la cuenta es: " + cuentas[i].getTitular().getnombre());
            }
        }
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

    //Getter de tamañoCC
    public int gettamañoCC(){
        return tamañoCC;
    }
}