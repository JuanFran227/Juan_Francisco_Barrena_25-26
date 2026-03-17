public class Clientes {
    private String nombre;
    private int id;

    public Clientes(){

    }

    public Clientes(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombrecliente(){
        return nombre;
    }

    public void setNombrecliente(String nombre){
        this.nombre = nombre;
    }

    public int getIdcliente(){
        return id;
    }

    public void setIdcliente(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "Cliente: " + nombre + "- ID: " + id;
    }
}