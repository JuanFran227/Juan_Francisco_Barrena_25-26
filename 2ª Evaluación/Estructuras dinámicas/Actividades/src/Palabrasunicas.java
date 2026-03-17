import java.util.HashSet;

public class Palabrasunicas {
    HashSet <Palabra> palabrasunicas = new HashSet<>();

    public void ingresarpalabra(String palabraañadida){
        Palabra p = new Palabra(palabraañadida);
        
        if (palabrasunicas.contains(p)) {
            System.out.println("La palabra existe");
        } else {
            palabrasunicas.add(p);
            System.out.println("La palabra se ha creado");
        }
    }

    public void eliminarpalabra(String palabraeliminada){
        Palabra p = new Palabra(palabraeliminada);

        if (palabrasunicas.contains(p)) {
            palabrasunicas.remove(p);
            System.out.println("La palabra se ha eliminado");
        } else {
            System.out.println("La palabra no existe");
        }
    }
}