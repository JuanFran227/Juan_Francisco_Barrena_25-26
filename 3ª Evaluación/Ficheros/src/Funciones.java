import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.io.IOException;

public class Funciones{

    //Crear el archivo
    public void crearDirectorio(){
        Path rutaDirectorio = Paths.get("Dataset");
        Path rutaArchivo = Paths.get("Dataset/Archivo.txt");

        try {
            if (Files.exists(rutaDirectorio)) { //Comprobamos si existe
                System.out.println("Este directorio ya existe");
            } else { //Si no existe lo creamos
                Files.createDirectories(rutaDirectorio);
                System.out.println("Directorio creado en: " + rutaDirectorio.toString());
                //Una vez creado el directorio creamos el archivo
                Files.createFile(rutaArchivo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Eliminar el archivo
    public void eliminarDirectorio(){
        //Seleccionamos el directorio Dataset y el archivo.txt
        Path ruta = Paths.get("Dataset/Archivo.txt");
        try { 
            //Files.delete(ruta);
            //Para comprobar la existencia del archivo usamos esto
            Files.deleteIfExists(ruta);
        } catch (IOException e) {
            System.out.println("No existe el archivo");
        }
    }


    //Copiar el archivo a otro archivo
    public void copiarDirectorio(){
        Path origenCopia = Paths.get("Dataset/Archivo.txt");
        Path destinoCopia = Paths.get("Dataset/CopiaArchivo");

        try {
            //Usamos el Files.copy para ejecutar el código
            Files.copy(origenCopia, destinoCopia);
        } catch (IOException e) {
            System.err.println("Errroooor en la copia del archivo");
        }
    }


    //Mover el archivo a otro archivo
    public void moverDirectorio(){
        Path origenArchivo = Paths.get("Dataset/Archivo.txt");
        Path destinoArchivo = Paths.get("Dataset/OtroDirectorio/Archivo.txt");

        try {
            //Files.move es la sentencia para este código
            Files.move(origenArchivo, destinoArchivo);
        } catch (IOException e) {
            System.err.println("Errrooor al mover el archivo");
        }
    }
    

    //Consultar el archivo
    public void consultarDirectorio(){
        Path ruta = Paths.get("Dataset/Archivo.txt");
        //Verifica si existe
        boolean existe = Files.exists(ruta);

        //Verifica si es un directorio
        boolean esDirectorio = Files.isDirectory(ruta);

        //Verififca si es otro tipo de archivo
        boolean esArchivo = Files.isRegularFile(ruta);

        System.out.println("¿Existe? " + existe);
        System.out.println("¿Es un directorio? " + esDirectorio);
        System.out.println("¿Es un archivo? " + esArchivo);
    }


    //Leer los atributos que tengan ese archivo
    public void leerAtributos(){
        Path archivo = Paths.get("Dataset/Archivo.txt");

        try {
            BasicFileAttributes atributos = Files.readAttributes(archivo, BasicFileAttributes.class);

            //Estos son los atributos
            System.out.println("¿Tamaño del archivo? " + atributos.size()); //Tamaño del archivo
            System.out.println("¿Es un directorio? " + atributos.isDirectory()); //Si es un directorio
            System.out.println("¿Es un archivo? " + atributos.isRegularFile()); //Si es un archivo
            System.out.println("Fecha de creación: " + atributos.creationTime()); //Cual es su fecha de creación
            System.out.println("Fecha de última modificación: " + atributos.lastModifiedTime()); //Su fecha de última modificación
            System.out.println("Fecha de último acceso: " + atributos.lastAccessTime()); //Fecha de último acceso
            System.out.println("¿Es un enlace simbólico? " + atributos.isSymbolicLink()); //Si es un enlace simbólico

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Vamos iterando el archivo para ver que contiene
    public void ContenidoDirectorio(){
        Path ruta = Paths.get("Dataset/Archivo.txt");

        //Creamos el flujo para revisar los ficheros
        try (DirectoryStream<Path> flujoDatos = Files.newDirectoryStream(ruta)){
            //Iteramos el contenido
            for(Path archivo : flujoDatos){
                System.out.println(archivo);
            }
        } catch (IOException e) {
            System.out.println("Error en el listado de Archivos");
        }
    }
}