import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bloque1{
    /*Escriba un programa que muestre por pantalla el contenido de un fichero de texto,
    así como el total de letras y el total de dígitos numéricos que hay. Plantee dos
    soluciones distintas.*/

    public void Ejercicio1v1(){
        //Primera solucion
        String nombrearchivo = "Archivo.txt";

        try {
            String contenido = new String(Files.readAllBytes(Paths.get(nombrearchivo)));
            System.out.println(contenido);

            int letras = 0;
            int digitos = 0;

            for(char c : contenido.toCharArray()){
                if (Character.isLetter(c)) {
                    letras++;
                } else if (Character.isDigit(c)) {
                    digitos++;
                }
            }

            System.out.println("Total de letras: " + letras);
            System.out.println("Total de dígitos: " + digitos);

        } catch (IOException e) {
            System.out.println("No se puede leer el fichero");
        }
    }

    public void Ejercicio1v2(){
        //Segunda solucion
        String nombrearchivo = "archivo.txt";

        int letras = 0;
        int digitos = 0;
        System.out.println(nombrearchivo);

        try (BufferedReader br = new BufferedReader(new FileReader(nombrearchivo))) {
            String linea;

            while (linea = br.readLine()) != null {
                System.out.println(linea);

                for(char c : linea.toCharArray()) {
                    if (Character.isLetter(c)) {
                        letras++;
                    } else if (Character.isDigit(c)) {
                        digitos++;
                    }
                }
            }

            System.out.println("Las letras son: " + letras);
            System.out.println("Los dígitos son: " + digitos);
        } catch (IOException e) {
            System.out.println("Error en leer el archivo");
        }
    }




    /*Escriba un programa que, a partir de un fichero de texto, genere dos ficheros: uno
    que contenga las vocales y otro que contenga las consonantes del fichero original. */

    public void Ejercicio2(){
        Path fichero = Paths.get("Archivo.txt");
        Path vocales = Paths.get("vocales.txt");
        Path consonantes = Paths.get("consonantes.txt");

        try {
            String contenido = Files.readString(fichero);

            StringBuilder vc = new StringBuilder();
            StringBuilder cn = new StringBuilder();

            for (char c : contenido.toCharArray()) {
                if (Character.isLetter(c)) {
                    char otro = Character.toLowerCase(c);

                    if ("aeiou".indexOf(otro) != -1) {
                        vc.append(c);
                    } else {
                        cn.append(c);
                    }
                }
            }

            Files.writeString(vocales, vc.toString());
            Files.writeString(consonantes, cn.toString());

            System.out.println("Se ha generado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}