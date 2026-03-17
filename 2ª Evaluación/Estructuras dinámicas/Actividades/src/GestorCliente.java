import java.util.ArrayList;
import java.util.Iterator;

public class GestorCliente {

    ArrayList<Clientes> clientes;


    //Con esto creamos el Array
    public GestorCliente(){
        this.clientes = new ArrayList<Clientes>();
    }


    //Utilizamos el add para añadir un nuevo cliente al array
    public void agregarCliente(Clientes cliente){
        this.clientes.add(cliente);
    }


    //Con contains nos aseguramos que en el Array estén ese nombre que estemos buscando
    public void buscarCliente(Clientes clt){
        if (this.clientes.contains(clt)) {
            System.out.println("El cliente " + clt + " está en la lista.");
        } else {
            System.out.println("El cliente " + clt + " no está en la lista.");
        }
    }


    //Con el clear lo que hacemos es borrar todo el array de clientes
    public void eliminarlistaClientes(){
        this.clientes.clear();
    }

    
    //Eliminamos clientes recorriendo el Array dinámico
    public void eliminarunclienteIterator(int id){
        Iterator<Clientes> iter = clientes.iterator();
        while (iter.hasNext()) {
            Clientes client = iter.next();
            if (client.getIdcliente() == id) {
                iter.remove();
            }
        }
    }


    //Añadimos un cliente al principio
    public void añadirClientePrincipio(Clientes cln){
        this.clientes.addFirst(cln);
    }


    //Añadimos un cliente al final
    public void añadirClienteFinal(Clientes cln){
        this.clientes.addLast(cln);
    }



    //Mostramos los clientes
    public void mostrarClientes(){
        System.out.println(this.clientes);
    }
}