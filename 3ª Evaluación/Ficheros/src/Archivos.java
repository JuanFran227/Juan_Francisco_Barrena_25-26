import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Archivos{

    //Leer todas las líneas de archivos de un texto
    public void leerArchivosdeTexto(){
        Path ruta = Paths.get("Dataset/Archivo.txt");

        //Creamos la lista String para guardar todas las líneas de texto del archivo, en un arrayList
        List<String> archivoTexto;

        try {
            if (Files.notExists(ruta)) { //Comprobamos si existe ese archivo
                System.out.println("Ese archivo no existe");
            } else {
                archivoTexto = Files.readAllLines(ruta);
                for(String linea : archivoTexto){
                    System.out.println(linea);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Este código es para escribir una línea cada vez
    public void EscribirI(){
        Path ruta = Paths.get("");

        try {
            if (Files.notExists(ruta)) {
                System.out.println("Ese archivo no existe");
            } else {
                //Para escribir una ruta en particular
                String contenido = "Primera línea de texto";
                Files.write(ruta, contenido.getBytes()); //Con esto sobreescribimos el contenido
                //Para añadir una línea sin sobreescribir 
                contenido = "Voy a escribir esta línea";
                Files.write(ruta, contenido.getBytes(), StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Este código es para volcar de una vez todo lo que hayas escrito
    public void EscribirII(){
        Path ruta = Paths.get("");

        try {
            if (Files.exists(ruta)) { //Comprobamos si existe
                System.out.println("Ese archivo ya existe");
            } else {
                //Para añadir un conjunto de líneas se usa un ArrayList
                List<String> lineas = new ArrayList<>();
                lineas.add("Primera línea");
                lineas.add("Segunda línea");
                lineas.add("Tercera línea");

                //Así se guarda cada posición
                Files.write(ruta, lineas, StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}