import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Path;

public class Bloque2 {
    /*Crear un programa en Java que borre el fichero cuya ruta ha sido introducida por el
    usuario. Si no existe se le indica al usuario */
    public void Ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la ruta");
        String ruta = sc.nextLine();

        Path fichero = Paths.get(ruta);

        try {
            if (Files.deleteIfExists(fichero)) {
                System.out.println("El fichero se ha borrado");
            } else {
                System.out.println("El fichero no existe");
            }
        } catch (Exception e) {
            System.out.println("Error al borrar el fichero");
        }
        sc.close();
    }    
    

    /*Escribe un programa que guarde en un fichero el contenido de otros dos ficheros,
    de tal forma que en el fichero resultante aparezcan las líneas de los dos primeros
    ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda
    será del segundo fichero…
    Hay que tener en cuenta que los ficheros de los que se cogen las líneas pueden
    tener tamaños diferentes. */
    public void Ejercicio2(){
        Path ruta = Paths.get("Archivo.txt");

        
    }


    /*Escribir un programa en Java que, para cualquier ruta indicada por el usuario,
    muestre:
    • Si el fichero existe o no
    • En caso de existir, si se trata de un directorio o de un fichero
    • En caso de ser un fichero, debe mostrar los siguientes datos:
    o Nombre
    o Tamaño
    o Permisos de lectura y escritura
    • En caso de ser un directorio, debe mostrar el contenido de dicho directorio. */
    public void Ejercicio3(){
        System.out.println("Escribe una ruta");
        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();

        Path fichero = Paths.get(ruta);

        try {
            if (Files.exists(fichero)) {
                System.out.println("La ruta existe");

                if (Files.isDirectory(fichero)) {
                    System.out.println("Es un directorio");
                    //Mostrar su contenido
                    DirectoryStream<Path> contenido = Files.newDirectoryStream(fichero);

                    for (Path p : contenido) {
                        System.out.println("Contenido: " + p.getFileName());
                    }

                } else if (Files.isRegularFile(fichero)) {
                    System.out.println("Es un fichero");
                    //Nombre;
                    System.out.println("Nombre: " + fichero.getFileName());
                    //Tamaño
                    System.out.println("Tamaño: " + Files.size(fichero));
                    //Permisos
                    System.out.println("Permiso de lectura: " + Files.isReadable(fichero));
                    System.out.println("Permiso de escritura: " + Files.isWritable(fichero));
                }
            } else {
                System.out.println("No existe esa ruta");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        sc.close();
    }


    /*Escribe un programa que lea los datos de un fichero de texto formado por palabras
    y números y muestre su contenido por pantalla de la forma que se indica a
    continuación. */
}
