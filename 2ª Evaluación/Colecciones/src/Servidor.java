import java.util.ArrayList;
import java.util.List;

public class Servidor {
    private String nombre;
    private List<Personaje> personajes;

    public Servidor(String nombre){
        this.nombre = nombre;
        this.personajes = new ArrayList<>();
    }

    //agregarPersonaje(Personaje p): Añade un personaje a la colección.
    public void agregarPersonaje(Personaje p){
        personajes.add(p);
    }

    /*listarPersonajes(): Muestra los personajes registrados en el servidor */
    public void listarPersonajes(){
        System.out.println("Los personajes en el servidor: " + nombre + "son: ");
        for(Personaje p : personajes){
            System.out.println(p);
        }
    }

    /*ordenarPersonajes(): Ordena los personajes dentro de la estructura de datos
    de manera ascendente utilizando el atributo de velocidad. Implementa para
    ello cualquier algoritmo de ordenación.*/
    public void ordenarPersonajes(){
        for(int i = 0; i < personajes.size(); i++){
            for(int j = 0; j < personajes.size() - 1; j++){
                if (personajes.get(j).getVelocidad() > personajes.get(j + 1).getVelocidad()) {
                    Personaje orden = personajes.get(j);
                    personajes.set(j, personajes.get(j + 1));
                    personajes.set(j + 1, orden);
                }
            }
        }
    }

    /*batalla(Personaje p1, Personaje p2): Simula una pelea entre dos personajes,
    reduciendo sus puntos de vida. El método acaba cuando la vida de alguno de
    ellos sea de cero o menos.*/
    public void batalla(Personaje p1, Personaje p2){
        
    }

    //Lo añado porque quiero Mariano
    public void eliminarlista(){
        personajes.clear();
    }
}