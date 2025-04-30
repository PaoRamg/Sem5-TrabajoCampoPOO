package sesion3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {

    public void leerArchivo (String nombreArchivo)throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
        String linea;

        System.out.println("Contenido del archivo:");
        while ((linea = lector.readLine()) != null) {
            System.out.println(linea);
        }
        lector.close();
    }
}
