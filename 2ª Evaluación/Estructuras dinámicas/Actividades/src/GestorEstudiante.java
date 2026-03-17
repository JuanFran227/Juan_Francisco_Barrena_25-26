import java.util.ArrayList;
import java.util.Iterator;

public class GestorEstudiante {

    ArrayList<Estudiantes> estudiantes;
    

    //Creamos el Array
    public GestorEstudiante(){
        this.estudiantes = new ArrayList<Estudiantes>();
    }


    //Con add añadimos los estudiantes a su Array
    public void agregarEstudiante(Estudiantes est){
        this.estudiantes.add(est);
    }


    //Con contains nos aseguramos que en el Array estén ese nombre que estemos buscando
    public void buscarEstudiante(Estudiantes est){
        if(this.estudiantes.contains(est)){
            System.out.println("El estudiante es: " + est);
        }
        else{
            System.out.println("Ese estudiante no existe");
        }
    }


    //Con el clear borramos toda la lista de estudiantes
    public void eliminarlistaEstudiantes(){
        this.estudiantes.clear();
    }


    //Añadir al principio un estudiante
    public void añadirestudianteprincipio(Estudiantes est){
        this.estudiantes.addFirst(est);
    }


    //Añadir al final un estudiante
    public void añadirestudiantefinal(Estudiantes est){
        this.estudiantes.addLast(est);
    }



    public void eliminarunestudianteIterator(int id){
        Iterator<Estudiantes> iter = estudiantes.iterator();
        while (iter.hasNext()) {
            Estudiantes estudiante = iter.next();
            if (estudiante.getidestudiante() == id) {
                iter.remove();
            }
        }
    }


    //Mostramos los estudiantes
    public void mostrarEstudiantes(){
        System.out.println(this.estudiantes);
    }
}   