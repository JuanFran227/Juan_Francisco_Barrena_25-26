public class Estudiantes {
    private String nombre;
    private int id;

    public Estudiantes(){

    }

    public Estudiantes(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getnombreestudiante(){
        return nombre;
    }

    public void setNombreestudiante(String nombre){
        this.nombre = nombre;
    }

    public int getidestudiante(){
        return id;
    }

    public void setIdestudiante(int id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "Estudiante: " + nombre + " - ID: " + id;
    }
}